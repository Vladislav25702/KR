package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "quests", schema = "users30", catalog = "")
public class QuestsEntity {
    @Basic
    @Column(name = "questTitle")
    private String questTitle;
    @Basic
    @Column(name = "questText")
    private String questText;
    @Basic
    @Column(name = "personId")
    private String personId;
    @Basic
    @Column(name = "reward")
    private int reward;
    @Basic
    @Column(name = "penalty")
    private int penalty;
    @Basic
    @Column(name = "timeOfStarted")
    private Timestamp timeOfStarted;
    @Basic
    @Column(name = "timeForQuestInMinutes")
    private short timeForQuestInMinutes;
    @Basic
    @Column(name = "placeId")
    private String placeId;
    @Basic
    @Column(name = "modelId")
    private String modelId;
    @Basic
    @Column(name = "levelDifficulty")
    private int levelDifficulty;
    @Basic
    @Column(name = "questStatus")
    private String questStatus;

    @Id
    @Column(name = "questId")
    private int questId;

    public String getQuestTitle() {
        return questTitle;
    }

    public void setQuestTitle(String questTitle) {
        this.questTitle = questTitle;
    }

    public String getQuestText() {
        return questText;
    }

    public void setQuestText(String questText) {
        this.questText = questText;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public Timestamp getTimeOfStarted() {
        return timeOfStarted;
    }

    public void setTimeOfStarted(Timestamp timeOfStarted) {
        this.timeOfStarted = timeOfStarted;
    }

    public short getTimeForQuestInMinutes() {
        return timeForQuestInMinutes;
    }

    public void setTimeForQuestInMinutes(short timeForQuestInMinutes) {
        this.timeForQuestInMinutes = timeForQuestInMinutes;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }

    public void setLevelDifficulty(int levelDifficulty) {
        this.levelDifficulty = levelDifficulty;
    }

    public String getQuestStatus() {
        return questStatus;
    }

    public void setQuestStatus(String questStatus) {
        this.questStatus = questStatus;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestsEntity that = (QuestsEntity) o;
        return reward == that.reward && penalty == that.penalty && timeForQuestInMinutes == that.timeForQuestInMinutes && levelDifficulty == that.levelDifficulty && questId == that.questId && Objects.equals(questTitle, that.questTitle) && Objects.equals(questText, that.questText) && Objects.equals(personId, that.personId) && Objects.equals(timeOfStarted, that.timeOfStarted) && Objects.equals(placeId, that.placeId) && Objects.equals(modelId, that.modelId) && Objects.equals(questStatus, that.questStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questTitle, questText, personId, reward, penalty, timeOfStarted, timeForQuestInMinutes, placeId, modelId, levelDifficulty, questStatus, questId);
    }
}
