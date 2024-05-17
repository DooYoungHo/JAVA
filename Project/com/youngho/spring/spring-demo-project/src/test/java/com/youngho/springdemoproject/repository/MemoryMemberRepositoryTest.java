package com.youngho.springdemoproject.repository;

import com.youngho.springdemoproject.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach     /* 메서드 한 번 끝날때마다 실행 */
    public void afterEach() {
        repository.clearStore();
    }

    /*
    * AfterEach  한번에 여러 테스트를 실행하면 메모리 DB에 직전 테스트의 결과가 남을 수 있다.
    * 이렇게 되면 다음 이전 테스트 때문에 다음 테스트가 실패할 가능성이 있다.
    * @AfterEach 를 사용하면 각 테스트가 종료 될 때 마다 이 기능을 실행한다. 여기서는 메모리 DB에 저장된 데이터를 삭제한다.
    * 테스트는 각각 독립적으로 실행되어야 한다. 테스트 순서에 의존관계가 있는 것은 좋은 테스트가 아니다
    * */

    @Test
    public void save() {
        // given
        Member member = new Member();
        member.setName("Young ho");

        // when
        repository.save(member);

        // then
        Member result = repository.findById(member.getId()).get();
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void findByName() {
        // given (초기 상태 설정)
        Member member1 = new Member();
        member1.setName("Sae Jon");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Young Ho");
        repository.save(member2);

        // when (테스트 하고자 하는 동작)
        Member result = repository.findByName("Sae Jon").get();
        Member result2 = repository.findByName("Young Ho").get();

        // then (테스트 결과 검증)
        assertThat(result).isEqualTo(member1);
        assertThat(result2).isEqualTo(member2);
    }

    @Test
    public void findAll() {
        // given
        Member member1 = new Member();
        member1.setName("Sae Jon");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Young Ho");
        repository.save(member2);

        // when
        List<Member> result = repository.findAll();

        // given
        assertThat(result.size()).isEqualTo(2);
    }
}
