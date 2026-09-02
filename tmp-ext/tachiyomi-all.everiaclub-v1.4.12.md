# Extension Validation Report

- Extension: tachiyomi-all.everiaclub-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
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
- Selected manga input: latest offset 0: Cosplay 年年Nnian &#8211; 夏天 (`.../cosplay-%E5%B9%B4%E5%B9%B4nnian-%E5%A4%8F%E5%A4%A9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Atsuko Maeda 前田敦子 – 6th Photobook 写真集 「Beste」 (`.../atsuko-maeda-%E5%89%8D%E7%94%B0%E6%95%A6%E5%AD%90-6th-photobook-%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8Cbeste%E3%80%8D`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Cosplay 年年Nnian &#8211; 夏天 (`.../cosplay-%E5%B9%B4%E5%B9%B4nnian-%E5%A4%8F%E5%A4%A9`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Rina Koike 小池里奈 &#8211; Sabra net e-Book 「麗しのサブリナ・ヒップ2」 (`.../rina-koike-%E5%B0%8F%E6%B1%A0%E9%87%8C%E5%A5%88-sabra-net-e-book-%E3%80%8C%E9%BA%97%E3%81%97%E3%81%AE%E3%82%B5%E3%83%96%E3%83%AA%E3%83%8A%E3%83%BB%E3%83%92%E3%83%83%E3%83%972%E3%80%8D`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Cosplay 年年Nnian – 夏天 (`.../cosplay-%E5%B9%B4%E5%B9%B4nnian-%E5%A4%8F%E5%A4%A9`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../cosplay-%E5%B9%B4%E5%B9%B4nnian-%E5%A4%8F%E5%A4%A9`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 80 |  |  | 1-10s |

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
| thumbnail | PASS | `https://ikimchi.yuhabox.top/.../COS09P028_0.webp` (image/webp (encoding: lossy), 37808 bytes, 400x600) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Cosplay 年年Nnian &#8211; 夏天 to Cosplay 年年Nnian – 夏天 |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Cosplay, 年年Nnian |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cosplay 年年Nnian – 夏天 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 80 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ikimchi.yuhabox.top/.../COS09P028_1.webp` (image/webp (encoding: lossy), 212976 bytes, 1000x1500) |  |  |  |
