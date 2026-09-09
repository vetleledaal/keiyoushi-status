# Extension Validation Report

- Extension: tachiyomi-zh.mangaxiaosi-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1939536259784675646
- Source name: Manga Xiao Si
- Source language: zh
- Selected manga input: latest offset 0: 理想型演算法 (`.../1219`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 秘密教學 (`.../418`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 22 | 理想型演算法 (`.../1219`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 22 | 義父 (`.../1151`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | 理想型演算法 (`.../1219`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 理想型演算法 (`.../1219`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | 第1話-戀愛就交給大數據 (`.../57043`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 316 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=理想型演算法, URL=`.../1219` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.jjmhw8.top/.../cover.jpg` (image/jpeg, 27316 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1219` |  |  |  |
| details thumbnail URL | PASS | `https://www.jjmhw8.top/.../cover.jpg` |  |  |  |
| details author | PASS | 夜景&清涼 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 都市 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 這是連戀愛都能交給AI的時代。我安裝了時下最火紅的配對軟體「S.Matching」，這款App號稱能用大數據算出使用者的理想型。當我滿懷期待點開通知，以為終於能跟暗戀對象搭上線時…「等等，AI是在整我嗎?」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | LINT | 10 of 11 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 316 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.jjmhw8.top/.../4776209.jpg` (image/jpeg, 13919 bytes, 720x800) |  |  |  |
