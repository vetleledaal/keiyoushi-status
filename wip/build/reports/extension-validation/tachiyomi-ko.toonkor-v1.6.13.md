# Extension Validation Report

- Extension: tachiyomi-ko.toonkor-v1.6.13
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 240 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 240 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 겨울 지나 벚꽃 (`.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 202 | 겨울 지나 벚꽃 1화02018-01-25 (`.../%EA%B2%A8%EC%9A%B8_%EC%A7%80%EB%82%98_%EB%B2%9A%EA%BD%83_1%ED%99%94.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 110 |  |  | <1s |

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
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==` -> 388 manga URLs (examples: `.../%EB%AC%B4%EB%8B%B9%EA%B8%B0%ED%98%91`, `.../%EB%82%98-%ED%99%80%EB%A1%9C-%EB%B2%84%EA%B7%B8%EB%A1%9C-%EA%BF%80%EB%B9%A0%EB%8A%94-%ED%94%8C%EB%A0%88%EC%9D%B4%EC%96%B4`, `.../%EC%97%AD%EB%8C%80%EA%B8%89-%EC%B0%BD%EA%B8%B0%EC%82%AC%EC%9D%98-%ED%9A%8C%EA%B7%80`) |  |  |  |
| thumbnail | PASS | `https://toonkor0.org/.../thumb-20180125_201921_96237_150x150.jpg` (image/jpeg, 21929 bytes, 480x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://toonkor0.org/.../20180125_201921_96237.jpg` was not downloaded |  |  |  |
| details author | PASS | 밤우 총 202화 로맨스.../BL |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <마지막 좀비> 밤우 작가의 청춘 BL! 한 지붕아래에서 사는 것도 모자라 같은반 동급생까지...?! 부모님이 돌아가신 후, 태성의 집에 얹혀살게 된 해봄은 고3이 되면서 태성과 같은 반이 된 상황이 난처하기만 하다. 24시간동안 함.. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 202 chapters |  |  |  |
| chapter dates | PASS | 202 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 110 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://toonkor0.org/.../%EC%97%B0%EC%9E%AC <redacted query values: fil>` to `https://008.toonkor.net/.../%EC%97%B0%EC%9E%AC <redacted query values: fil>` (2 redirects); popular: `https://toonkor0.org/.../%EC%97%B0%EC%9E%AC` to `https://008.toonkor.net/.../%EC%97%B0%EC%9E%AC` (2 redirects); popular: `https://toonkor0.org/.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83` to `https://008.toonkor.net/.../%EA%B2%A8%EC%9A%B8-%EC%A7%80%EB%82%98-%EB%B2%9A%EA%BD%83` (2 redirects); popular: `https://toonkor0.org/.../search.php <redacted query values: sfl and stx>` to `https://008.toonkor.net/.../search.php <redacted query values: sfl and stx>` (2 redirects); popular: `https://toonkor0.org/.../%EA%B2%A8%EC%9A%B8_%EC%A7%80%EB%82%98_%EB%B2%9A%EA%BD%83_1%ED%99%94.html` to `https://008.toonkor.net/.../%EA%B2%A8%EC%9A%B8_%EC%A7%80%EB%82%98_%EB%B2%9A%EA%BD%83_1%ED%99%94.html` (2 redirects); popular: `https://toonkor0.org/.../20180125_201921_96237.jpg` to `https://toonkor2.org/.../20180125_201921_96237.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://aws-cloud-no7.site/.../1516881053212.jpg` (image/jpeg, 90271 bytes, 720x1350) |  |  |  |
