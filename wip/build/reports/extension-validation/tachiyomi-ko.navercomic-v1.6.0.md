# Extension Validation Report

- Extension: tachiyomi-ko.navercomic-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1311262507446028482
- Source name: Naver Webtoon
- Source language: ko
- Selected manga input: popular offset 0: 육아일기 (`.../list <redacted query values: titleId and week>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 112 | 육아일기 (`.../list <redacted query values: titleId and week>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 112 | 럭키비치 (`.../list <redacted query values: titleId and week>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 육아일기 (`.../list <redacted query values: titleId>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 육아일기 (`.../list <redacted query values: titleId and week>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 267 | 1화 첫만남 (`.../detail <redacted query values: titleId and no>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 112 entries |  |  |  |
| latest listing | PASS | 112 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=육아일기, URL=`.../list <redacted query values: titleId>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 226/226 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 226/226 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://image-comic.pstatic.net/.../thumbnail_IMAG21_2896806f-bd3e-48af-b7e2-8e380ff702a4.jpg` -> 2 manga URLs (examples: `.../list <redacted query values: titleId and week>`, `.../list <redacted query values: titleId>`) |  |  |  |
| thumbnail | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_2896806f-bd3e-48af-b7e2-8e380ff702a4.jpg` (image/jpeg, 48379 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: titleId and week>` |  |  |  |
| details thumbnail URL | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_2896806f-bd3e-48af-b7e2-8e380ff702a4.jpg` |  |  |  |
| details author | PASS | 자까 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 이젠 갠플이 아니라 팀플이다!  <br>조별 과제와 차원이 다른 인생을 건 팀플이 시작된다. <br>1인가구에서 2인가구로 2인가구에서 3인 가구로 인생 난이도가 급격히 상승한 자까 작가의 일상 이야기 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 267 chapters |  |  |  |
| chapter dates | PASS | 267 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image-comic.pstatic.net/.../img-ctguide-white_new.png` (image/png, 10207 bytes, 690x197) |  |  |  |
