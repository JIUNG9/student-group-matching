package com.studygroup.entity;

import javax.persistence.*;

import com.studygroup.enums.GroupRole;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(name ="study_group_member")
public class StudyGroupMember extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 256, nullable = false)
    private String nickName;

    @Column(length = 256, nullable = false)
    private String intro;


    @Column(columnDefinition = "integer default 0", nullable = false)
    private int warnCount;


    @Enumerated(EnumType.STRING)
    private GroupRole groupRole;

    @OneToMany(mappedBy = "studyGroupMember",cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<StudyGroupMemberPlan> studyGroupMemberPlanList;

    @ManyToOne
    @JoinColumn
    private StudyGroup studyGroup;

    @ManyToOne
    @JoinColumn
    private Member member;


}

