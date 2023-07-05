package com.studygroup.service.group.member;

import com.studygroup.domain.StudyGroup;
import com.studygroup.domain.StudyGroupMember;
import org.springframework.stereotype.Service;

@Service
public interface FindGroupMemberService {

  StudyGroupMember getGroupMember(StudyGroup studyGroup, Object param);
}
