package Messenger;

public class EmoticonText implements Text{
    private String content;

    public EmoticonText(String content){
        this.content = content;
    }

    @Override
    public String toString(){
        switch (content){
            case "winking": return new String(Character.toChars(0x1F609));
            case "ghost": return new String(Character.toChars(0x1F47B));
            case "dizzy": return new String(Character.toChars(0x1F635));
            case "confused": return new String(Character.toChars(0x1F615));
            case "angry": return new String(Character.toChars(0x1F620));
            case "joy": return new String(Character.toChars(0x1F602));
            default: return "Wrong emoticon";
        }
    }
}
