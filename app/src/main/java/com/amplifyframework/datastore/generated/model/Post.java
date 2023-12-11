package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.ModelIdentifier;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Post type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Posts", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byUser", fields = {"userID"})
public final class Post implements Model {
  public static final QueryField ID = field("Post", "id");
  public static final QueryField TITLE = field("Post", "Title");
  public static final QueryField CATEGORY = field("Post", "Category");
  public static final QueryField SERVICE_NAME = field("Post", "ServiceName");
  public static final QueryField RATING = field("Post", "Rating");
  public static final QueryField ZIP_CODE = field("Post", "ZipCode");
  public static final QueryField CONTENT = field("Post", "Content");
  public static final QueryField USER_ID = field("Post", "userID");
  public static final QueryField POST_DATE = field("Post", "postDate");
  public static final QueryField POST_IMG_URL = field("Post", "postImgUrl");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String Title;
  private final @ModelField(targetType="String", isRequired = true) String Category;
  private final @ModelField(targetType="String") String ServiceName;
  private final @ModelField(targetType="Float", isRequired = true) Double Rating;
  private final @ModelField(targetType="Int") Integer ZipCode;
  private final @ModelField(targetType="String", isRequired = true) String Content;
  private final @ModelField(targetType="ID", isRequired = true) String userID;
  private final @ModelField(targetType="AWSDate") Temporal.Date postDate;
  private final @ModelField(targetType="AWSURL") String postImgUrl;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  /** @deprecated This API is internal to Amplify and should not be used. */
  @Deprecated
   public String resolveIdentifier() {
    return id;
  }
  
  public String getId() {
      return id;
  }
  
  public String getTitle() {
      return Title;
  }
  
  public String getCategory() {
      return Category;
  }
  
  public String getServiceName() {
      return ServiceName;
  }
  
  public Double getRating() {
      return Rating;
  }
  
  public Integer getZipCode() {
      return ZipCode;
  }
  
  public String getContent() {
      return Content;
  }
  
  public String getUserId() {
      return userID;
  }
  
  public Temporal.Date getPostDate() {
      return postDate;
  }
  
  public String getPostImgUrl() {
      return postImgUrl;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Post(String id, String Title, String Category, String ServiceName, Double Rating, Integer ZipCode, String Content, String userID, Temporal.Date postDate, String postImgUrl) {
    this.id = id;
    this.Title = Title;
    this.Category = Category;
    this.ServiceName = ServiceName;
    this.Rating = Rating;
    this.ZipCode = ZipCode;
    this.Content = Content;
    this.userID = userID;
    this.postDate = postDate;
    this.postImgUrl = postImgUrl;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Post post = (Post) obj;
      return ObjectsCompat.equals(getId(), post.getId()) &&
              ObjectsCompat.equals(getTitle(), post.getTitle()) &&
              ObjectsCompat.equals(getCategory(), post.getCategory()) &&
              ObjectsCompat.equals(getServiceName(), post.getServiceName()) &&
              ObjectsCompat.equals(getRating(), post.getRating()) &&
              ObjectsCompat.equals(getZipCode(), post.getZipCode()) &&
              ObjectsCompat.equals(getContent(), post.getContent()) &&
              ObjectsCompat.equals(getUserId(), post.getUserId()) &&
              ObjectsCompat.equals(getPostDate(), post.getPostDate()) &&
              ObjectsCompat.equals(getPostImgUrl(), post.getPostImgUrl()) &&
              ObjectsCompat.equals(getCreatedAt(), post.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), post.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getTitle())
      .append(getCategory())
      .append(getServiceName())
      .append(getRating())
      .append(getZipCode())
      .append(getContent())
      .append(getUserId())
      .append(getPostDate())
      .append(getPostImgUrl())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Post {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("Title=" + String.valueOf(getTitle()) + ", ")
      .append("Category=" + String.valueOf(getCategory()) + ", ")
      .append("ServiceName=" + String.valueOf(getServiceName()) + ", ")
      .append("Rating=" + String.valueOf(getRating()) + ", ")
      .append("ZipCode=" + String.valueOf(getZipCode()) + ", ")
      .append("Content=" + String.valueOf(getContent()) + ", ")
      .append("userID=" + String.valueOf(getUserId()) + ", ")
      .append("postDate=" + String.valueOf(getPostDate()) + ", ")
      .append("postImgUrl=" + String.valueOf(getPostImgUrl()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static TitleStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Post justId(String id) {
    return new Post(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      Title,
      Category,
      ServiceName,
      Rating,
      ZipCode,
      Content,
      userID,
      postDate,
      postImgUrl);
  }
  public interface TitleStep {
    CategoryStep title(String title);
  }
  

  public interface CategoryStep {
    RatingStep category(String category);
  }
  

  public interface RatingStep {
    ContentStep rating(Double rating);
  }
  

  public interface ContentStep {
    UserIdStep content(String content);
  }
  

  public interface UserIdStep {
    BuildStep userId(String userId);
  }
  

  public interface BuildStep {
    Post build();
    BuildStep id(String id);
    BuildStep serviceName(String serviceName);
    BuildStep zipCode(Integer zipCode);
    BuildStep postDate(Temporal.Date postDate);
    BuildStep postImgUrl(String postImgUrl);
  }
  

  public static class Builder implements TitleStep, CategoryStep, RatingStep, ContentStep, UserIdStep, BuildStep {
    private String id;
    private String Title;
    private String Category;
    private Double Rating;
    private String Content;
    private String userID;
    private String ServiceName;
    private Integer ZipCode;
    private Temporal.Date postDate;
    private String postImgUrl;
    @Override
     public Post build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Post(
          id,
          Title,
          Category,
          ServiceName,
          Rating,
          ZipCode,
          Content,
          userID,
          postDate,
          postImgUrl);
    }
    
    @Override
     public CategoryStep title(String title) {
        Objects.requireNonNull(title);
        this.Title = title;
        return this;
    }
    
    @Override
     public RatingStep category(String category) {
        Objects.requireNonNull(category);
        this.Category = category;
        return this;
    }
    
    @Override
     public ContentStep rating(Double rating) {
        Objects.requireNonNull(rating);
        this.Rating = rating;
        return this;
    }
    
    @Override
     public UserIdStep content(String content) {
        Objects.requireNonNull(content);
        this.Content = content;
        return this;
    }
    
    @Override
     public BuildStep userId(String userId) {
        Objects.requireNonNull(userId);
        this.userID = userId;
        return this;
    }
    
    @Override
     public BuildStep serviceName(String serviceName) {
        this.ServiceName = serviceName;
        return this;
    }
    
    @Override
     public BuildStep zipCode(Integer zipCode) {
        this.ZipCode = zipCode;
        return this;
    }
    
    @Override
     public BuildStep postDate(Temporal.Date postDate) {
        this.postDate = postDate;
        return this;
    }
    
    @Override
     public BuildStep postImgUrl(String postImgUrl) {
        this.postImgUrl = postImgUrl;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String title, String category, String serviceName, Double rating, Integer zipCode, String content, String userId, Temporal.Date postDate, String postImgUrl) {
      super.id(id);
      super.title(title)
        .category(category)
        .rating(rating)
        .content(content)
        .userId(userId)
        .serviceName(serviceName)
        .zipCode(zipCode)
        .postDate(postDate)
        .postImgUrl(postImgUrl);
    }
    
    @Override
     public CopyOfBuilder title(String title) {
      return (CopyOfBuilder) super.title(title);
    }
    
    @Override
     public CopyOfBuilder category(String category) {
      return (CopyOfBuilder) super.category(category);
    }
    
    @Override
     public CopyOfBuilder rating(Double rating) {
      return (CopyOfBuilder) super.rating(rating);
    }
    
    @Override
     public CopyOfBuilder content(String content) {
      return (CopyOfBuilder) super.content(content);
    }
    
    @Override
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
    
    @Override
     public CopyOfBuilder serviceName(String serviceName) {
      return (CopyOfBuilder) super.serviceName(serviceName);
    }
    
    @Override
     public CopyOfBuilder zipCode(Integer zipCode) {
      return (CopyOfBuilder) super.zipCode(zipCode);
    }
    
    @Override
     public CopyOfBuilder postDate(Temporal.Date postDate) {
      return (CopyOfBuilder) super.postDate(postDate);
    }
    
    @Override
     public CopyOfBuilder postImgUrl(String postImgUrl) {
      return (CopyOfBuilder) super.postImgUrl(postImgUrl);
    }
  }
  

  public static class PostIdentifier extends ModelIdentifier<Post> {
    private static final long serialVersionUID = 1L;
    public PostIdentifier(String id) {
      super(id);
    }
  }
  
}
