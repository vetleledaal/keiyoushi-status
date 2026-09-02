# Extension Validation Report

- Extension: tachiyomi-ko.navercomic-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 3
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1311262507446028482
- Source name: Naver Webtoon
- Source language: ko
- Selected manga input: latest offset 0: 2026 루키 단편선 (`https://m.comic.naver.com/.../list <redacted query values: titleId and week>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 108 | 화산귀환 (`https://m.comic.naver.com/.../list <redacted query values: titleId and week>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 108 | 2026 루키 단편선 (`https://m.comic.naver.com/.../list <redacted query values: titleId and week>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 2026 루키 단편선 (`.../list <redacted query values: titleId>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 2026 루키 단편선 (`.../list <redacted query values: titleId>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | 1화. 미소 업그레이드 - 깨수일 작가 (`.../detail <redacted query values: titleId and no>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 143 |  |  | 1-10s |

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
| popular listing | PASS | 108 entries |  |  |  |
| latest listing | PASS | 108 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=2026 루키 단편선, URL=`.../list <redacted query values: titleId>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | UNUSUAL | 217/217 listing manga have titles and URLs; popular: all absolute; latest: all absolute; search: all relative; Absolute URL examples: popular entry 1: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>`, popular entry 2: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>`, popular entry 3: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>` |  |  |  |
| thumbnail URLs | PASS | 217/217 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://image-comic.pstatic.net/.../thumbnail_IMAG21_4e600f8e-41c1-4932-8c7f-34a9470930ac.jpg` -> 2 manga URLs (examples: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>`, `.../list <redacted query values: titleId>`) |  |  |  |
| thumbnail | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_4e600f8e-41c1-4932-8c7f-34a9470930ac.jpg` (image/jpeg, 62360 bytes, 480x623) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `https://m.comic.naver.com/.../list <redacted query values: titleId and week>` to `.../list <redacted query values: titleId>` |  |  |  |
| details thumbnail URL | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_4e600f8e-41c1-4932-8c7f-34a9470930ac.jpg` |  |  |  |
| details author | PASS | 네이버웹툰 작가 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 전설적인 두 거장의 손끝에서 태어난 가장 뜨거운 신인들의 기록.<br>이현세·이두호 프로듀싱 하에 탄생한 ‘지옥캠프’ 단편선이 마침내 공개됩니다.<br>2026년, 웹툰계의 판도를 바꿀 루키 23인의 압도적인 첫 발걸음을 목격하라! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 143 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://image-comic.pstatic.net/.../age_15_white.jpg` (image/jpeg, 10161 bytes, 690x360) |  |  |  |
