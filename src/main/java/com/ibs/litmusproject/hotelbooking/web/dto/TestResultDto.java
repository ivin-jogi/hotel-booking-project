package com.ibs.litmusproject.hotelbooking.web.dto;
//test dto class
public class TestResultDto {
    private Long id;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TestResultDto{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
