package org.opensourcebim.bcf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.io.IOUtils;
import org.opensourcebim.bcf.markup.Header;
import org.opensourcebim.bcf.markup.Markup;
import org.opensourcebim.bcf.markup.Topic;
import org.opensourcebim.bcf.visinfo.VisualizationInfo;

public class TopicFolder {
	private byte[] defaultSnapShot;
	private byte[][] allSnapShots;
	private Markup markup;
	private VisualizationInfo visualizationInfo;
	private UUID uuid;
	private Topic topic = new Topic();
	private Header header;

	public TopicFolder(UUID uuid) {
		this.uuid = uuid;
	}

	public TopicFolder() {
		this.uuid = UUID.randomUUID();
	}
	
	public void setMarkup(Markup markup) {
		this.markup = markup;
	}

	public void setVisualizationInfo(VisualizationInfo visualizationInfo) {
		this.visualizationInfo = visualizationInfo;
	}

	public void setDefaultSnapShot(byte[] defaultSnapShot) {
		this.defaultSnapShot = defaultSnapShot;
	}

	public byte[] getDefaultSnapShot() {
		return defaultSnapShot;
	}

	public VisualizationInfo getVisualizationInfo() {
		if (visualizationInfo == null) {
			visualizationInfo = new VisualizationInfo();
		}
		return visualizationInfo;
	}

	public Markup getMarkup() {
		if (markup == null) {
			markup = new Markup();
		}
		return markup;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void write(ZipOutputStream zipOutputStream) throws IOException, BcfException {
		ZipEntry markup = new ZipEntry(getUuid().toString() + "/markup.bcf");
		zipOutputStream.putNextEntry(markup);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Markup.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(getMarkup(), zipOutputStream);
		} catch (JAXBException e) {
			throw new BcfException(e);
		}

		ZipEntry visualizationInfo = new ZipEntry(getUuid().toString() + "/viewpoint.bcfv");
		zipOutputStream.putNextEntry(visualizationInfo);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(VisualizationInfo.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(getVisualizationInfo(), zipOutputStream);
		} catch (JAXBException e) {
			throw new BcfException(e);
		}

		ZipEntry image = new ZipEntry(getUuid().toString() + "/snapshot.png");
		zipOutputStream.putNextEntry(image);
		ByteArrayInputStream bais = new ByteArrayInputStream(getDefaultSnapShot());
		IOUtils.copy(bais, zipOutputStream);
	}

	public IfcFileReference createIfcFileReference() {
		IfcFileReference ifcFileReference = new IfcFileReference();
		return ifcFileReference;
	}

	public Header createHeader() {
		header = new Header();
		return header;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setDefaultSnapShot(InputStream inputStream) throws IOException {
		defaultSnapShot = IOUtils.toByteArray(inputStream);
	}
}
