# Extension Validation Report

- Extension: tachiyomi-id.rosyscans-v1.6.2
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
- Source theme: mangathemesia
- Source ID: 9147884000487951300
- Source name: Rosyscans
- Source language: id
- Selected manga input: popular offset 0: The Remarried Empress (`.../the-remarried-empress`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Remarried Empress (`.../the-remarried-empress`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Everyone Was Obsessed With Me After I Became The Youngest Princess Favourite (`.../everyone-was-obsessed-with-me-after-i-became-the-youngest-princess-favourite`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | The Demon King’s Channel (`.../the-demon-kings-channel`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Ardel’s Couple Fraud (`.../ardels-couple-fraud`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Remarried Empress (`.../the-remarried-empress`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Remarried Empress (`.../the-remarried-empress`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 249 | Chapter 1 (`.../the-remarried-empress-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Remarried Empress, URL=`.../the-remarried-empress` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../HVUPY7QaIAAcGGR.webp` (image/jpeg, 405387 bytes, 1079x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-remarried-empress` |  |  |  |
| details thumbnail URL | PASS | `https://i3.wp.com/.../HVUPY7QaIAAcGGR.webp` |  |  |  |
| details author | PASS | Alpha Tart, Herelee |  |  |  |
| details artist | PASS | Sumpul |  |  |  |
| details genres | PASS | Drama, Fantasy, Josei, Rofan, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Navier Ellie Trovi adalah seorang permaisuri yang sempurna dalam segala hal—cerdas, berani, dan pandai bergaul. Ia baik hati kepada rakyatnya dan setia kepada suaminya. Navier merasa sangat puas menjalani sisa hidupnya sebagai permaisuri bijaksana Kekaisaran Timur. Setidaknya, sampai suaminya membawa pulang seorang selir dan menuntut cerai. “Aku menerima perceraian ini… Dan aku meminta persetujuan untuk menikah lagi.” Dalam sebuah kejutan yang mengejutkan, Navier menikah lagi dengan seorang kaisar lain dan mempertahankan gelarnya serta mimpi masa kecilnya sebagai permaisuri. Namun, bagaimana sebenarnya semuanya terjadi?<br><br>Alternative Names: <br>- Die neuvermählte Kaiserin<br>- Hoàng hậu tái hôn<br>- Jaehon Hwanghu<br>- L'impératrice remariée<br>- La emperatriz de volvio a casar<br>- La emperatriz divorciada<br>- Remarried Empress<br>- Second marriage of the Empress<br>- The Second Marriage<br>- The Second Marriage of the Empress<br>- Tái hôn Hoàng hậu<br>- Второй брак императрицы<br>- Императрица вновь выходит замуж<br>- Императрица снова выходит замуж<br>- Повторное замужество императрицы<br>- การแต่งงานครั้งใหม่ของจักรพรรดินี<br>- 再婚承認を要求します<br>- 再婚皇后<br>- 재혼 황후<br>- 재혼황후 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 249 chapters |  |  |  |
| chapter dates | PASS | 249 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.rosyscans.id/.../001.jpg <redacted query values: v>` (image/jpeg, 325077 bytes, 728x1266) |  |  |  |
