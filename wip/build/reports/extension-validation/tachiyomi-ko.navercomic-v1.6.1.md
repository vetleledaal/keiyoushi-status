# Extension Validation Report

- Extension: tachiyomi-ko.navercomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: 광마회귀 (`.../list <redacted query values: titleId and week>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 116 | 광마회귀 (`.../list <redacted query values: titleId and week>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 116 | 그랬더니 남친임니다 (`.../list <redacted query values: titleId and week>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 광마회귀 (`.../list <redacted query values: titleId>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 광마회귀 (`.../list <redacted query values: titleId and week>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 218 | 1화 (`.../detail <redacted query values: titleId and no>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 87 |  |  | 1-10s |

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
| popular listing | PASS | 116 entries |  |  |  |
| latest listing | PASS | 116 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=광마회귀, URL=`.../list <redacted query values: titleId>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 233/233 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 233/233 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://image-comic.pstatic.net/.../thumbnail_IMAG21_7365135131254864183.jpg` -> 2 manga URLs (examples: `.../list <redacted query values: titleId and week>`, `.../list <redacted query values: titleId>`) |  |  |  |
| thumbnail | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_7365135131254864183.jpg` (image/jpeg, 58332 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: titleId and week>` |  |  |  |
| details thumbnail URL | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_7365135131254864183.jpg` |  |  |  |
| details author | PASS | JP, 이히, 유진성 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 무공에 미친 광마 이자하.<br>그는 마교 교주의 천옥을 훔쳐 쫓기던 중 벼랑에서 떨어지게 된다.<br>모든 게 끝났다고 생각한 순간 눈을 떠보니, 사람들에게 무시당하던 점소이 시절로 돌아와 있는데...<br>게다가 억울한 누명으로 두들겨 맞고 객잔은 박살이 나 있는 상황. <br>​점소이 시절로 회귀한 광마! <br>사내는 다시 미치게 될 것인가? 아니면 사내의 적들이 미치게 될 것인가. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 218 chapters |  |  |  |
| chapter dates | PASS | 218 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image-comic.pstatic.net/.../age_15_white.jpg` (image/jpeg, 10161 bytes, 690x360) |  |  |  |
