# Extension Validation Report

- Extension: tachiyomi-ja.comicearthstar-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3574188328700228273
- Source name: Comic Earth Star
- Source language: ja
- Selected manga input: popular offset 0: 完璧OLナンノさん、実は超音痴の崖っぷちアイドルでした (`.../12207421984131657091`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 28 | 完璧OLナンノさん、実は超音痴の崖っぷちアイドルでした (`.../12207421984131657091`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 完璧OLナンノさん、実は超音痴の崖っぷちアイドルでした (`.../12207421984131657091`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 完璧OLナンノさん、実は超音痴の崖っぷちアイドルでした (`.../12207421984131657091`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 【読切】完璧OLナンノさん、実は超音痴の崖っぷちアイドルでした (`.../12207421984131657091`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=完璧OLナンノさん、実は超音痴の崖っぷちアイドルでした, URL=`.../12207421984131657091` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984131654528-15c71263a797fe6ab75f2cb5ad41f063 <redacted query values: 1787900060>` (image/jpeg, 23912 bytes, 311x176) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984131657091` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-earthstar.com%2Fpublic%2Fseries-thumbnail%2F12207421984131654528-15c71263a797fe6ab75f2cb5ad41f063%3F1787900060` (image/jpeg, 22547 bytes, 311x176) |  |  |  |
| details author | PASS | 漫画：みなもと海 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 美人で仕事も完璧な後輩・南野（みなみの）さん。密かに「ナンノさん」と呼び憧れていた沢田は、うだつが上がらない日々を一人カラオケで発散していた。隣室の音痴な女性が、まさかのナンノさんで…！？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984156861369-f7023b2632981ead5625399890f0349a` (image/jpeg, 510083 bytes, 1351x1920) |  |  |  |
