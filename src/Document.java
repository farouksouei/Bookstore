public interface Document {
    public String getDocumentName();

    public String getDocumentText();

    public int getDocumentSize();

    public int getDocumentId();

    public void setDocumentName(String name);

    public void setDocumentText(String text);

    public void setDocumentSize(int size);

    public void setDocumentId(int id);

}