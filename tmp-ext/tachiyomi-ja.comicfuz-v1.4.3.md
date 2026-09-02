# Extension Validation Report

- Extension: tachiyomi-ja.comicfuz-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7341666123577520203
- Source name: COMIC FUZ
- Source language: ja
- Selected manga input: latest offset 0: 件の件について (`.../3945`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | 愛したがりと、愛されたがり (`.../1818`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 60 | 愛したがりと、愛されたがり (`.../1818`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 62 | 件の件について (`.../3945`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 件の件について (`.../3945`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 件の件について (`.../3945`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 22 | 第1話 (`.../74523`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| latest listing | PASS | 62 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=件の件について, URL=`.../3945` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 183/183 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 183/183 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.comic-fuz.com/.../tm.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 48162 bytes, 1080x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3945` |  |  |  |
| details thumbnail URL | PASS | `https://img.comic-fuz.com/.../tm.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 端, イズタニC |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 水曜日, オリジナル, 男性向け, SF・ファンタジー, 恋愛, お仕事・趣味, FUZコミックス, 新規連載作品, 日常, 9/1発売 FUZオリジナル作品新刊 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 件(くだん)——予言の力を持つ、半人半牛の妖怪。<br><br>小説編集・狭間ユウの目に留まった１本の小説は、<br>件の少女・坂斑子が予言の力を駆使して書き上げた、<br>2人の未来を元ネタにした作品だったことが判明する。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | LINT | 1 of 22 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.comic-fuz.com/.../0.jpeg.enc <redacted query values: h, e, key, and iv>` (image/jpeg, 684571 bytes, 1351x1920) |  |  |  |
