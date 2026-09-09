# Extension Validation Report

- Extension: tachiyomi-ko.toonkor-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6596496791271983268
- Source name: Toonkor
- Source language: ko
- Selected manga input: latest offset 0: 이레즈미 소개팅남 (`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 240 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 240 | 이레즈미 소개팅남 (`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 이레즈미 소개팅남 (`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 이레즈미 소개팅남 (`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 31 | 이레즈미 소개팅남 1화 첫만남 (`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8_%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8_1%ED%99%94_%EC%B2%AB%EB%A7%8C%EB%82%A8%C2%A0.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=이레즈미 소개팅남, URL=`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 481/481 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 481/481 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==` -> 378 manga URLs (examples: `.../%EC%97%AD%EB%8C%80%EA%B8%89-%EC%B0%BD%EA%B8%B0%EC%82%AC%EC%9D%98-%ED%9A%8C%EA%B7%80`, `.../3%ED%95%99%EB%85%84-5%EB%B0%98`, `.../%EC%95%84%EC%B9%B4%EB%8D%B0%EB%AF%B8%EC%9D%98-%EC%B2%9C%EC%9E%AC%EC%B9%BC%EC%9E%A1%EC%9D%B4`) |  |  |  |
| thumbnail | PASS | `https://tkor151.com/.../thumb-20260607_152119_27806_150x150.jpg` (image/jpeg, 11231 bytes, 150x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tkor151.com/.../20260607_152119_27806.jpg` (image/jpeg, 30537 bytes, 480x240) |  |  |  |
| details author | PASS | 토깽이 총 31화 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 등장부터 심상치 않은 소개팅남이 나타났다! 몸 이곳저곳에 보이는 문신이며 예상과 상식을 뛰어넘는 기상천외한 행동까지! 소개팅으로 시작되는 두 남녀의 예측불가 유쾌발랄 로맨스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://aws-cloud-no0.site/.../17808133778914_0182.jpeg` (image/jpeg, 92930 bytes, 690x1757) |  |  |  |
