# Extension Validation Report

- Extension: tachiyomi-ja.comicfuz-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7341666123577520203
- Source name: COMIC FUZ
- Source language: ja
- Selected manga input: popular offset 0: 愛したがりと、愛されたがり (`.../1818`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | 愛したがりと、愛されたがり (`.../1818`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | 愛したがりと、愛されたがり (`.../1818`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 61 | 柚季の甲子園 (`.../4187`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 愛したがりと、愛されたがり (`.../1818`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 愛したがりと、愛されたがり (`.../1818`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | １巻 第１話 （１） (`.../19842`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 61 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=愛したがりと、愛されたがり, URL=`.../1818` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 182/182 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 182/182 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.comic-fuz.com/.../cl.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 19268 bytes, 1080x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1818` |  |  |  |
| details thumbnail URL | PASS | `https://img.comic-fuz.com/.../cl.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 木下ネリ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 土曜日, 女性向け, BL, 花音コミックス |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 会社が倒産！職も家も貯金も失った白石は、公園で野宿しようとしていたところ以前接待で訪れた店の美形ホスト・アキトに拾われる。顔見知り程度の相手にどうしてここまで優しくしてくれるのだろうか…？白石に出された同居の条件。それは、アキトの望むときにセックスをすることで！？　疲れた男たちの、カラダから始める温かい恋愛。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.comic-fuz.com/.../0.jpeg.enc <redacted query values: h, e, key, and iv>` (image/jpeg, 814205 bytes, 1350x1920) |  |  |  |
