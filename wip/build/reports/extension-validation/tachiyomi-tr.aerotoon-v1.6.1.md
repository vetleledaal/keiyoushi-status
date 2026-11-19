# Extension Validation Report

- Extension: tachiyomi-tr.aerotoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1538587979414015537
- Source name: AeroToon
- Source language: tr
- Selected manga input: popular offset 0: The Painter Who Draws Dungeons (`.../35`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | The Painter Who Draws Dungeons (`.../35`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 2 | Gözler (`.../39`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Reincarnator’s Stream (`.../63`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | The Return of Namgung’s Granddaughter (`.../46`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Painter Who Draws Dungeons (`.../35`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Painter Who Draws Dungeons (`.../35`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Bölüm 1 - Jio'nun Portresi (`.../159`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Painter Who Draws Dungeons, URL=`35` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.ibb.co/.../cover-17087380-ee8c-4f6f-9dc2-2538685477f2.webp` (image/webp (encoding: lossy), 218146 bytes, 800x1163) |  |  |  |
| details identity | PASS | Details preserved selected URL `35` |  |  |  |
| details thumbnail URL | PASS | `https://i.ibb.co/.../cover-17087380-ee8c-4f6f-9dc2-2538685477f2.webp` |  |  |  |
| details author | PASS | Hobby Writing Principle |  |  |  |
| details artist | PASS | Glee |  |  |  |
| details genres | PASS | Manhwa, Fantasy, Mystery, Seinen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 5<br><br>“Büyük Felaket“ tarafından sonsuza dek değişen bir dünya. Eski sanat öğretmeni Seo Jio, ani bir yangında ölür, ardından bir portreye çekilir ve tablonun bir parçası olur.<br><br>Portre dünyasında, Jio tanrısal güçler kazanır ve bu güçler ona yaşam yaratmasını ve hatta diğer boyutlara açılan kapıları açmasını sağlar.<br><br>Yetenekleri sayesinde Jio, sayısız insanla karşılaşır ve karşılaştıkları sorunları aşmalarına yardımcı olmaya çalışır. Ancak boyutları aştıkça ve karşılaştığı olayları çözdükçe, kendi ölümünün ardında saklı gerçeği ortaya çıkarmaya o kadar yaklaşır...<br>Daha az göster<br><br>**Alternative Names:**<br>- Zindan Çizen Ressam,A Painter Who Draws Dungeons, Artist Who Paints Dungeons |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.ibb.co/.../page-159-001.webp` (image/webp (encoding: lossy), 119504 bytes, 1200x721) |  |  |  |
