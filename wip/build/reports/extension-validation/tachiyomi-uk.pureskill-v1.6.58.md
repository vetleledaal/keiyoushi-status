# Extension Validation Report

- Extension: tachiyomi-uk.pureskill-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2988064575635454860
- Source name: Mangarama
- Source language: uk
- Selected manga input: popular offset 0: Тільки я можу воскресати (`.../1161`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 96 | Тільки я можу воскресати (`.../1161`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 96 | Герой, що не знає спокою (`.../1676`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Тільки я можу воскресати (`.../1161`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Тільки я можу воскресати (`.../1161`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | Розділ 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 87 |  |  | 1-10s |

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
| popular listing | PASS | 96 entries |  |  |  |
| latest listing | PASS | 96 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Тільки я можу воскресати, URL=`1161` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangarama.com.ua/.../cover-1-175x238.jpg` (image/jpeg, 14574 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1161` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangarama.com.ua/.../cover-1-193x278.jpg` (image/jpeg, 18086 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Бої на мечах, Бойові мистецтва, ГГ чоловік, Гільдії, Дружба, Підземелля, Пригоди, Реінкарнація, Система, Чудовиська |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Природжений дар: Воскресіння. Що за неймовірно читерська здібність?! Але Тан Хьон іще не здогадувався, що приховує в собі це «безсмертя» — біль смерті, жагу до неї та неможливість піти назавжди. Саме безсмертне тіло перетворило його на найсумнозвіснішого мисливця планети! Не лихо для людства… ні, радше той, хто стає на прю з лихами, що загрожують людству… І сьогодні я знову повстану з мертвих — сам, без чиєїсь допомоги!<br><br>Альтернативні назви: I am resurrected alone · 나 혼자 부활한다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | PASS | 29 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.mangarama.com.ua/.../%21987.webp <redacted query values: mrr_v, mrr_kid, mrr_exp, mrr_sub, mrr_ctx, and mrr_sig>` (image/webp (encoding: lossy), 128256 bytes, 1051x1015) |  |  |  |
