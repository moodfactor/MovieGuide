package com.esoxjem.movieguide;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author arun
 */
public class Review implements Parcelable {

  /*
   * Responsible for deserialization
   */
  public static final Creator<Review> CREATOR = new Creator<Review>() {

    /**
     *Get the original object from the serialized object
     * @param in
     * @return
     */
    @Override
    public Review createFromParcel(Parcel in) {
      return new Review(in);
    }

    /**
     * Create the original object array of the specified length
     * @param size
     * @return
     */
    @Override
    public Review[] newArray(int size) {
      return new Review[size];
    }
  };
  private String id;
  private String author;
  private String content;
  private String url;

  public Review() {
  }

  protected Review(Parcel in) {
    id = in.readString();
    author = in.readString();
    content = in.readString();
    url = in.readString();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Description
   * What is returned is the description of the content
   * Only for some special objects that need to describe information, you need to return 1, and
   * return 0 in other cases.
   */
  @Override
  public int describeContents() {
    return 0;
  }

  /**
   * Serialization
   */
  @Override
  public void writeToParcel(Parcel parcel, int i) {
    parcel.writeString(id);
    parcel.writeString(author);
    parcel.writeString(content);
    parcel.writeString(url);
  }
}
