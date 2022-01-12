package com.bruincreates.server.dao.po;

import java.util.Date;

public class ProductReview {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_review.id
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_review.product_id
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_review.reviewer
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    private String reviewer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_review.review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    private String review;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_review.date_created
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    private Date dateCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_review.deleted
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_review.id
     *
     * @return the value of product_review.id
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_review.id
     *
     * @param id the value for product_review.id
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_review.product_id
     *
     * @return the value of product_review.product_id
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_review.product_id
     *
     * @param productId the value for product_review.product_id
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_review.reviewer
     *
     * @return the value of product_review.reviewer
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_review.reviewer
     *
     * @param reviewer the value for product_review.reviewer
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_review.review
     *
     * @return the value of product_review.review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public String getReview() {
        return review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_review.review
     *
     * @param review the value for product_review.review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public void setReview(String review) {
        this.review = review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_review.date_created
     *
     * @return the value of product_review.date_created
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_review.date_created
     *
     * @param dateCreated the value for product_review.date_created
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_review.deleted
     *
     * @return the value of product_review.deleted
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_review.deleted
     *
     * @param deleted the value for product_review.deleted
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}