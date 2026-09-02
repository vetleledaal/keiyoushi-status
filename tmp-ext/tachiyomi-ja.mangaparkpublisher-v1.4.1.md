# Extension Validation Report

- Extension: tachiyomi-ja.mangaparkpublisher-v1.4.1
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
- Source ID: 2905661176145448719
- Source name: Manga-Park
- Source language: ja
- Selected manga input: popular offset 0: 営業部の高杉さんは心臓に悪い (`.../64096`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 営業部の高杉さんは心臓に悪い (`.../64096`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 92 | 営業部の高杉さんは心臓に悪い (`.../64096`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 営業部の高杉さんは心臓に悪い (`.../64096`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 営業部の高杉さんは心臓に悪い (`.../64096`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 200 | 🆓 第1話・第2話 (`.../558814`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 92 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=営業部の高杉さんは心臓に悪い, URL=`.../64096` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-park.com/.../2\$rNuVwgw.jpg <redacted query values: 7cVx63ZrQ4IuamMCDWNC-RWDZX_80VDdcjsnQw4pYe0>` (image/jpeg, 52563 bytes, 540x540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../64096` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-park.com/.../1\$ptuVwgw.jpg <redacted query values: O-duLj3hUhnXlthjo6BfFCejha_DU9VY2SK8d2XZ3eE>` (image/jpeg, 64198 bytes, 750x450) |  |  |  |
| details author | PASS | eruko |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女子向け, 恋愛, Parkオリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 商社で事務をする堤さん。彼女の部署に転属してきた高杉さんは、仕事はできるけど自分にも他人にも厳しい鬼上司！ でも、そんな彼が見せる不意打ちな優しさにときめいてしまって―!? ハイスペ上司に翻弄される♥オフィスラブコメ！ ★CV.島﨑信長さんによる、 PVはコチラ、ショート動画はコチラから！ ★eruko先生のX(Twitter)はコチラ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 200 chapters |  |  |  |
| chapter dates | PASS | 200 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manga-park.com/.../2h\$4pCCugw.jpg.enc <redacted query values: rKXBqQ3cy9fz-crC0TEBgJDX1dylJ8gSQXoGDax4qSgQBk3meiHiC90XPjE1i186tSyQgKtU>` (image/jpeg, 177441 bytes, 960x1378; server Content-Type: application/octet-stream) |  |  |  |
