package MusicApp;

import java.util.Arrays;

public class AudioContent {
    private byte[] content;

    public AudioContent(byte[] content) {
        super();
        this.content = content;
    }
    public byte[] getContent() {
        return content;
    }
    @Override
    public String toString() {
        return "AudioContent{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

}
