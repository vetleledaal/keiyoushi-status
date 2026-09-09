# Extension Validation Report

- Extension: tachiyomi-ja.mangamee-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5152016637336953348
- Source name: MangaMee
- Source language: ja
- Selected manga input: latest offset 0: 君に届け (`.../241`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 完璧ワイフによる完璧な復讐計画 (`.../53213`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 102 | 君に届け (`.../241`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 君に届け (`.../241`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 君に届け (`.../241`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 325 | episode0.プロローグ- ① (`.../12370`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 102 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=君に届け, URL=`241` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 154/154 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 154/154 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://prod-img.manga-mee.jp/.../8654.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 73984 bytes, 1125x666) |  |  |  |
| details identity | PASS | Details preserved selected URL `241` |  |  |  |
| details thumbnail URL | PASS | `https://prod-img.manga-mee.jp/.../8654.webp <redacted query values: hash and expires>` |  |  |  |
| details author | PASS | 椎名軽穂 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 初恋, 恋愛.../%E5%AD%A6%E5%9C%92, キュンとする |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 陰気な見た目のせいで怖がられたり謝られたりしちゃう爽子。<br>爽子に分けへだてなく接してくれる風早に憧れている。風早の言葉をきっかけに変わっていけるみたい…。夏休み前、爽子は肝試しでお化け役をやることに!?<br><br>Alternative Title: きみにとどけ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 325 chapters |  |  |  |
| chapter dates | LINT | All 325 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=325 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://prod-img.manga-mee.jp/.../17603564.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 74264 bytes, 760x1200) |  |  |  |
