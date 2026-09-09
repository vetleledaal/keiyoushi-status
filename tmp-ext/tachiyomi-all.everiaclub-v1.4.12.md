# Extension Validation Report

- Extension: tachiyomi-all.everiaclub-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7698513740234984368
- Source name: Everia.club
- Source language: all
- Selected manga input: latest offset 0: Niko Kawago 川越にこ &#8211; ヌード写真集 「おとなにこ」 (`.../niko-kawago-%E5%B7%9D%E8%B6%8A%E3%81%AB%E3%81%93-%E3%83%8C%E3%83%BC%E3%83%89%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8C%E3%81%8A%E3%81%A8%E3%81%AA%E3%81%AB%E3%81%93%E3%80%8D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Sayaka Nitori 似鳥沙也加 – デジタル限定版 写真集 「ふれあ、」 (`.../sayaka-nitori-%E4%BC%BC%E9%B3%A5%E6%B2%99%E4%B9%9F%E5%8A%A0-%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E9%99%90%E5%AE%9A%E7%89%88-%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8C%E3%81%B5%E3%82%8C%E3%81%82%E3%80%81`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Niko Kawago 川越にこ &#8211; ヌード写真集 「おとなにこ」 (`.../niko-kawago-%E5%B7%9D%E8%B6%8A%E3%81%AB%E3%81%93-%E3%83%8C%E3%83%BC%E3%83%89%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8C%E3%81%8A%E3%81%A8%E3%81%AA%E3%81%AB%E3%81%93%E3%80%8D`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Eunji Pyo 표은지 &#8211; Photobook 「Girlfriend」 Vol.02 (`.../eunji-pyo-%ED%91%9C%EC%9D%80%EC%A7%80-photobook-%E3%80%8Cgirlfriend%E3%80%8D-vol-02`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Niko Kawago 川越にこ – ヌード写真集 「おとなにこ」 (`.../niko-kawago-%E5%B7%9D%E8%B6%8A%E3%81%AB%E3%81%93-%E3%83%8C%E3%83%BC%E3%83%89%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8C%E3%81%8A%E3%81%A8%E3%81%AA%E3%81%AB%E3%81%93%E3%80%8D`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../niko-kawago-%E5%B7%9D%E8%B6%8A%E3%81%AB%E3%81%93-%E3%83%8C%E3%83%BC%E3%83%89%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8C%E3%81%8A%E3%81%A8%E3%81%AA%E3%81%AB%E3%81%93%E3%80%8D`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 87 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reiobox.top/.../GRA09V092_0.webp` (image/webp (encoding: lossy), 32798 bytes, 400x600) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Niko Kawago 川越にこ &#8211; ヌード写真集 「おとなにこ」 to Niko Kawago 川越にこ – ヌード写真集 「おとなにこ」 |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Niko Kawago 川越にこ, ヌード写真集 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Niko Kawago 川越にこ – ヌード写真集 「おとなにこ」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reiobox.top/.../GRA09V092_1.webp` (image/webp (encoding: lossy), 168062 bytes, 1272x1800) |  |  |  |
