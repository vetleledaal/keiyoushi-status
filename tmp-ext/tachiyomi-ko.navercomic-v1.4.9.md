# Extension Validation Report

- Extension: tachiyomi-ko.navercomic-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 29
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
- Selected manga input: latest offset 0: 이레즈미 소개팅남 (`https://m.comic.naver.com/.../list <redacted query values: titleId and week>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 108 | 소꿉친구 컴플렉스 (`https://m.comic.naver.com/.../list <redacted query values: titleId and week>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 108 | 이레즈미 소개팅남 (`https://m.comic.naver.com/.../list <redacted query values: titleId and week>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 이레즈미 소개팅남 (`.../list <redacted query values: titleId>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 이레즈미 소개팅남 (`.../list <redacted query values: titleId>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 31 | 1화 첫만남 (`.../detail <redacted query values: titleId and no>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | <1s |

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
| search listing | LINT | Matched selected manga by title at result offset 0: title=이레즈미 소개팅남, URL=`.../list <redacted query values: titleId>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | UNUSUAL | 217/217 listing manga have titles and URLs; popular: all absolute; latest: all absolute; search: all relative; Absolute URL examples: popular entry 1: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>`, popular entry 2: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>`, popular entry 3: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>` |  |  |  |
| thumbnail URLs | PASS | 217/217 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://image-comic.pstatic.net/.../thumbnail_IMAG21_1db5f4fc-1580-4b78-98bf-c8fd9952fbea.jpg` -> 2 manga URLs (examples: `https://m.comic.naver.com/.../list <redacted query values: titleId and week>`, `.../list <redacted query values: titleId>`) |  |  |  |
| thumbnail | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_1db5f4fc-1580-4b78-98bf-c8fd9952fbea.jpg` (image/jpeg, 48955 bytes, 480x623) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `https://m.comic.naver.com/.../list <redacted query values: titleId and week>` to `.../list <redacted query values: titleId>` |  |  |  |
| details thumbnail URL | PASS | `https://image-comic.pstatic.net/.../thumbnail_IMAG21_1db5f4fc-1580-4b78-98bf-c8fd9952fbea.jpg` |  |  |  |
| details author | PASS | 토깽이 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 등장부터 심상치 않은 소개팅남이 나타났다!<br>몸 이곳저곳에 보이는 문신이며 예상과 상식을 뛰어넘는 기상천외한 행동까지!<br>소개팅으로 시작되는 두 남녀의 예측불가 유쾌발랄 로맨스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image-comic.pstatic.net/.../img-ctguide-white_new.png` (image/png, 10207 bytes, 690x197) |  |  |  |
