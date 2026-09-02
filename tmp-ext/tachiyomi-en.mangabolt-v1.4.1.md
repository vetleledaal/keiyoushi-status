# Extension Validation Report

- Extension: tachiyomi-en.mangabolt-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 2
- Warnings: 2
- Skipped: 5
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 286088605022156276
- Source name: MangaBolt
- Source language: en
- Selected manga input: latest offset 0: Fairy Tail: 100 Years Quest (`.../fairy-tail-100-years-quest`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Fairy Tail: 100 Years Quest (`.../fairy-tail-100-years-quest`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fairy Tail: 100 Years Quest (`.../fairy-tail-100-years-quest`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 223 | Fairy Tail: 100 Years Quest Chapter 0 (`https://mangabolt.com/.../fairy-tail-100-years-quest-chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | <1s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 12/12 latest manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 12/12 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://i.imgur.com/.../jpVjoLx.png` -> 2 manga URLs (examples: `.../fairy-tail-100-years-quest`, `.../fairy-tail-re-fantasia`) |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../jpVjoLx.png` (image/png, 226189 bytes, 322x321) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fairy-tail-100-years-quest` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../jpVjoLx.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Fairy Tail: 100 Years Quest (フェアリーテイル １００年クエスト Fearī Teiru Hyaku-nen Kuesuto) is a Japanese manga series by Atsuo Ueda and the sequel to the main series Fairy Tail. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 223 chapters |  |  |  |
| chapter dates | LINT | All 223 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=223 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 223 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.mangabolt.com/.../1.jpeg` (image/jpeg, 258254 bytes, 960x1378) |  |  |  |
