# Extension Validation Report

- Extension: tachiyomi-ko.toonkor-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 3
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6596496791271983268
- Source name: Toonkor
- Source language: ko
- Selected manga input: latest offset 0: 만계 출석 시스템 (`.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 240 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 240 | 만계 출석 시스템 (`.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 만계 출석 시스템 (`.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 만계 출석 시스템 (`.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 219 | 만계 출석 시스템 1화 (`.../%EB%A7%8C%EA%B3%84_%EC%B6%9C%EC%84%9D_%EC%8B%9C%EC%8A%A4%ED%85%9C_1%ED%99%94.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 95 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 240 entries |  |  |  |
| latest listing | PASS | 240 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=만계 출석 시스템, URL=`.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 481/481 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 481/481 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==` -> 374 manga URLs (examples: `.../%EC%95%84%EC%B9%B4%EB%8D%B0%EB%AF%B8%EC%9D%98-%EC%B2%9C%EC%9E%AC%EC%B9%BC%EC%9E%A1%EC%9D%B4`, `.../%EA%B0%80%EB%93%9C%ED%8C%A8%EC%8A%A4`, `.../%EC%98%81%EC%9B%85-%ED%9A%8C%EA%B7%80%ED%95%98%EB%8B%A4`) |  |  |  |
| thumbnail | PASS | `https://toonkor0.org/.../thumb-20220123_183141_22402_150x150.jpg` (image/jpeg, 47003 bytes, 480x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://toonkor0.org/.../20220123_183141_22402.jpg` was not downloaded |  |  |  |
| details author | PASS | 열 마리 울새 총 219화 판타지.../%EB%AC%B4%ED%98%91 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 왜 꼭 이런 육체로 환생했을까? 하지만 그것은 시스템의 기본 설정! 만계출석시스템 은 아주 허접한 몸에 빙의해서 시작하도록 설정되어 있었다 난 잘나가는 아버지 덕에 높은 지위는 가졌으나 재능과 실력이 없었던 신자, 진태서의 몸에 빙의했다 하지만 시스템 덕에 초반부터 영력이 마르지 않게 해주는 만계 최고 수련비법, 영동단전(永動丹田)을 얻게 되는데…! 끊임없이 출석 지점을 퀘스트로 던져주는 시스템 덕에 보상 얻는 재미도 쏠쏠하다 나 진태서, 초반 아이템인 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 219 chapters |  |  |  |
| chapter dates | PASS | 219 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 95 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://toonkor0.org/.../%EC%97%B0%EC%9E%AC` to `https://toonkor3.org/.../%EC%97%B0%EC%9E%AC` (2 redirects); popular: `https://toonkor0.org/.../%EC%97%B0%EC%9E%AC <redacted query values: fil>` to `https://toonkor3.org/.../%EC%97%B0%EC%9E%AC <redacted query values: fil>` (2 redirects); popular: `https://toonkor0.org/.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C` to `https://toonkor3.org/.../%EB%A7%8C%EA%B3%84-%EC%B6%9C%EC%84%9D-%EC%8B%9C%EC%8A%A4%ED%85%9C` (2 redirects); popular: `https://toonkor0.org/.../search.php <redacted query values: sfl and stx>` to `https://toonkor3.org/.../search.php <redacted query values: sfl and stx>` (2 redirects); popular: `https://toonkor0.org/.../%EB%A7%8C%EA%B3%84_%EC%B6%9C%EC%84%9D_%EC%8B%9C%EC%8A%A4%ED%85%9C_1%ED%99%94.html` to `https://toonkor3.org/.../%EB%A7%8C%EA%B3%84_%EC%B6%9C%EC%84%9D_%EC%8B%9C%EC%8A%A4%ED%85%9C_1%ED%99%94.html` (2 redirects) |  |  |  |
| page load | PASS | `https://aws-cloud-no3.site/.../16429304240396.jpeg` (image/jpeg, 53177 bytes, 598x906) |  |  |  |
