# Extension Validation Report

- Extension: tachiyomi-ko.toonkor-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 29
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
- Selected manga input: popular offset 0: 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 240 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 240 | 이레즈미 소개팅남 (`.../%EC%9D%B4%EB%A0%88%EC%A6%88%EB%AF%B8-%EC%86%8C%EA%B0%9C%ED%8C%85%EB%82%A8`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 189 | 겨울 지나 벚꽃 1화 (`.../%EA%B2%A8%EC%9A%B8_%EC%A7%80%EB%82%98_%EB%B2%9A%EA%BD%83_1%ED%99%94.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 110 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=겨울 지나 벚꽃, URL=`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 481/481 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 481/481 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==` -> 380 manga URLs (examples: `.../%EC%97%AD%EB%8C%80%EA%B8%89-%EC%B0%BD%EA%B8%B0%EC%82%AC%EC%9D%98-%ED%9A%8C%EA%B7%80`, `.../3%ED%95%99%EB%85%84-5%EB%B0%98`, `.../%EC%95%84%EC%B9%B4%EB%8D%B0%EB%AF%B8%EC%9D%98-%EC%B2%9C%EC%9E%AC%EC%B9%BC%EC%9E%A1%EC%9D%B4`) |  |  |  |
| thumbnail | PASS | `https://tkor148.com/.../thumb-20180125_201921_96237_150x150.jpg` (image/jpeg, 9909 bytes, 150x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tkor148.com/.../20180125_201921_96237.jpg` (image/jpeg, 21929 bytes, 480x240) |  |  |  |
| details author | PASS | 밤우 총 189화 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <마지막 좀비> 밤우 작가의 청춘 BL! 한 지붕아래에서 사는 것도 모자라 같은반 동급생까지...?! 부모님이 돌아가신 후, 태성의 집에 얹혀살게 된 해봄은 고3이 되면서 태성과 같은 반이 된 상황이 난처하기만 하다. 24시간동안 함.. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 189 chapters |  |  |  |
| chapter dates | PASS | 189 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 110 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://aws-cloud-no7.site/.../1516881053212.jpg` (image/jpeg, 90271 bytes, 720x1350) |  |  |  |
