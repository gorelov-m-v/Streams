package infstreams;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

class XmlUtils {

    public static Map<String, Long> countAllByTagName(List<XmlFile> files, String tagName) {
        return files.stream()
                .collect(groupingBy(XmlFile::getEncoding,
                        mapping(XmlFile::getTags,
                                filtering(file -> file.stream()
                                                .map(Tag::getName)
                                                .anyMatch(tagName::equals),
                                        summingLong(List::size)))));
        // write your code here
    }
}

class Tag {
    private final String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class XmlFile {
    private final String id;
    private final String encoding;
    private final List<Tag> tags;

    public XmlFile(String id, String encoding, List<Tag> tags) {
        this.id = id;
        this.encoding = encoding;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public String getEncoding() {
        return encoding;
    }
}