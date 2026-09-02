# Extension Validation Report

- Extension: tachiyomi-ja.hanayume-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6820605856874807465
- Source name: Hana To Yume+
- Source language: ja
- Selected manga input: popular offset 0: おそらくカノジョは俺の兄貴を狙ってる (`.../7918b4de0a0ac`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | おそらくカノジョは俺の兄貴を狙ってる (`.../7918b4de0a0ac`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 5 | 魔性の檻 (`.../794d51655a588`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | おそらくカノジョは俺の兄貴を狙ってる (`.../7918b4de0a0ac`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | おそらくカノジョは俺の兄貴を狙ってる (`.../7918b4de0a0ac`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 73 | 1話 (`.../bc43f35254f09`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=おそらくカノジョは俺の兄貴を狙ってる, URL=`.../7918b4de0a0ac` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 38/38 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 38/38 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260402141520599CC2A0B0F4BD8912C711185F6389A3F22-lg.webp` (image/webp (encoding: lossy), 29136 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7918b4de0a0ac` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260402141520599CC2A0B0F4BD8912C711185F6389A3F22.png` (image/png, 3314833 bytes, 2560x1344) |  |  |  |
| details author | PASS | 伊瀬まるの |  |  |  |
| details artist | PASS | 伊瀬まるの |  |  |  |
| details genres | PASS | 恋愛・ラブコメ, 学園・青春, ＋オリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 女性不信の男子高校生・遠野陽太。イケメンの兄貴と近づきたい女子たちに幾度となく利用され騙されてきた彼はもう二度と女性を信じないと決めていた。そんな中、やたらと陽太に話しかけてくるクラスの美少女・北条泉が現れて！？兄貴狙い…？気になる泉の心中とはーー。疑心暗鬼ラブコメディここに開幕☆ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.hanayume.com/.../master-1782444114075-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 9, 14, 15, 0, 7, 8, 3, 4, 12, 5, 11, 10, 1, 6, 13\]` (image/jpeg, 251902 bytes, 960x1378) |  |  |  |
