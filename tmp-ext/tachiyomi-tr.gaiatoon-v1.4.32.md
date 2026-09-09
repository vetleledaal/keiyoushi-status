# Extension Validation Report

- Extension: tachiyomi-tr.gaiatoon-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7364322791901505063
- Source name: Gaiatoon
- Source language: tr
- Selected manga input: popular offset 0: Ters Harem Oyununa Düştüm! (`.../ters-harem-oyununa-dustum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Ters Harem Oyununa Düştüm! (`.../ters-harem-oyununa-dustum`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 11 | Iris: The Lady and Her Smartphone (`.../iris-the-lady-and-her-smartphone`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Cafe Midnight (`.../cafe-midnight`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 11 | Erkek Başrollerin Düşmanı Oldum (`.../erkek-basrollerin-dusmani-oldum`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ters Harem Oyununa Düştüm! (`.../ters-harem-oyununa-dustum`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ters Harem Oyununa Düştüm! (`.../ters-harem-oyununa-dustum`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 136 | Bölüm 1 (`.../ters-harem-oyununa-dustum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ters Harem Oyununa Düştüm!, URL=`.../ters-harem-oyununa-dustum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gaiatoon.com/.../Ters-Harem-Oyununa-Dustum-219x300.jpg` (image/jpeg, 23602 bytes, 219x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ters-harem-oyununa-dustum` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://gaiatoon.com/.../Ters-Harem-Oyununa-Dustum.jpg` (image/jpeg, 666826 bytes, 864x1184) |  |  |  |
| details author | PASS | Inui (이늬) |  |  |  |
| details artist | PASS | GOYA |  |  |  |
| details genres | PASS | Fantastik, Harem, Josei, Romantizm, Yetişkin |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Garip bir yatakta uyandım, yanımda sadece bir değil, iki sevgiliyle! Bu aşk, şefkat ve aldatma oyununda, ben İmparatorluk Prensesi Elvia ve benim iyiliğim için yarışan bir grup erkekle beraberim. Harika, değil mi? Bunun dışında, ana karakter manipülatif hizmetçim Arielle iken ben de kötü kadın oldum! Beni alt etmek için ve benim erkek haremimle ilgili planları var. Ama tüm sırlarını biliyorum çünkü oyuncu bildirimlerini görebiliyorum. Onu kendi oyununda yenebilir miyim? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 136 chapters |  |  |  |
| chapter dates | PASS | 136 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gaiatoon.com/.../1-0-I-FELL-INTO-A-REVERSE-HAREM-GAME-JPG-KAPAK.jpg` (image/jpeg, 199116 bytes, 1200x1000) |  |  |  |
