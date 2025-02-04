public class Magazine {
    
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if(title==null|| title.isBlank()){
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        if(publisher==null|| publisher.isBlank()){
            throw new IllegalArgumentException("Publisher cannot be null or blank.");
        }
        this.publisher = publisher;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        if(issueNumber<=0){
            throw new IllegalArgumentException("Issue number must be greater than 0.");
        }
        this.issueNumber = issueNumber;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        if(publicationYear<=0){
            throw new IllegalArgumentException("Publication year number must be greater than 0.");
        }
        this.publicationYear = publicationYear;
    }

    public Magazine(Magazine sourcMagazine) {
        setTitle(sourcMagazine.getTitle());
        setPublisher(sourcMagazine.getPublisher());
        setIssueNumber(sourcMagazine.getIssueNumber());
        setPublicationYear(sourcMagazine.getPublicationYear());
    }
   
    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }
}
