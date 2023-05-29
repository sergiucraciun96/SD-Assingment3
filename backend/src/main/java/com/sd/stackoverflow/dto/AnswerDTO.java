package com.sd.stackoverflow.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDTO {

    private Long answerId;
    private String answerText;
    private LocalDateTime answerTextCreated;
    private UserDTO user;
    private QuestionDTO question;
    private Integer posVotes;
    private Integer negVotes;
    private Boolean currentUserVote;
}
