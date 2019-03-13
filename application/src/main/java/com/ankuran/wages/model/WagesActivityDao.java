package com.ankuran.wages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Sushil Mittal.
 * @Created At 12/03/19.
 */
@Entity
@Table(name = "wages_activity")
public class WagesActivityDao {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "wages_activity_key")
    private Long wagesActivityKey;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "centre_id")
    private Long centreId;

    @Column(name = "activity_id")
    private Long activityId;

    @Column(name = "linked_activity_id")
    private Long linkedActivityId;

    @Column(name = "type")
    private Long type;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "due_per_item")
    private Double duePerItem;

    @Column(name = "item_quantity")
    private Integer itemQuantity;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "changed")
    private Integer changed;

    @Column(name = "misc_info")
    private String miscInfo;

    @Column(name = "actor_employee_id")
    private Integer actorEmployeeId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "status")
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWagesActivityKey() {
        return wagesActivityKey;
    }

    public void setWagesActivityKey(Long wagesActivityKey) {
        this.wagesActivityKey = wagesActivityKey;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getCentreId() {
        return centreId;
    }

    public void setCentreId(Long centreId) {
        this.centreId = centreId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getLinkedActivityId() {
        return linkedActivityId;
    }

    public void setLinkedActivityId(Long linkedActivityId) {
        this.linkedActivityId = linkedActivityId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getDuePerItem() {
        return duePerItem;
    }

    public void setDuePerItem(Double duePerItem) {
        this.duePerItem = duePerItem;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getChanged() {
        return changed;
    }

    public void setChanged(Integer changed) {
        this.changed = changed;
    }

    public String getMiscInfo() {
        return miscInfo;
    }

    public void setMiscInfo(String miscInfo) {
        this.miscInfo = miscInfo;
    }

    public Integer getActorEmployeeId() {
        return actorEmployeeId;
    }

    public void setActorEmployeeId(Integer actorEmployeeId) {
        this.actorEmployeeId = actorEmployeeId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
