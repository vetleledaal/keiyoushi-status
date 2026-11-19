# Extension Validation Report

- Extension: tachiyomi-tr.seitoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5545124468484671399
- Source name: Seitoon
- Source language: tr
- Selected manga input: popular offset 0: Yumruk Kralının Dönüşü (`.../yumruk-kralinin-donusu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Yumruk Kralının Dönüşü (`.../yumruk-kralinin-donusu`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Paralı Askerin Soylular Arasında Yeniden Doğuşu (`.../parali-askerin-soylular-arasinda-yeniden-dogusu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yumruk Kralının Dönüşü (`.../yumruk-kralinin-donusu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yumruk Kralının Dönüşü (`.../yumruk-kralinin-donusu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 77 | Bölüm 1 - Yumruk kralı baskına uğrar (`.../yumruk-krali-baskina-ugrar`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yumruk Kralının Dönüşü, URL=`.../yumruk-kralinin-donusu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.seitoon.com.tr/.../5f060c86-effd-46a6-8922-420958b1ac6e.png` (image/png, 1514329 bytes, 843x1264) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yumruk-kralinin-donusu` |  |  |  |
| details thumbnail URL | PASS | `https://media.seitoon.com.tr/.../5f060c86-effd-46a6-8922-420958b1ac6e.png` |  |  |  |
| details author | PASS | Yu Jin-Sung (유진성) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Aksiyon, Dövüş Sanatları, Fantezi, Macera, Reenkarnasyon, Shounen, Dahi MC, Geçmişe Dönüş, Güçlenme, Güçlü Başkarakter, Karizma Başkarakter, Klan / Tarikat Rekabeti, Murim, Silahsız Dövüş, İntikam |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 4.83 (12)<br>**Publisher:** Naver Webtoon · **Studio:** DONAX Studio<br><br>Bir zamanlar sadece yumruklarına güvenerek Murim’de dolaşan Dan Woosung, Şeytani Tarikat'ın elinde ani bir son buldu. Ardından kendini, zengin bir tüccar loncası olan Eunha’nın en büyük oğlunun bedeninde bulur.<br><br>“Borçlardan da kinlerden de kaçmak istemiyorum. Borçlar ödenmeli, kinlerin hesabı sorulmalı.”<br><br>Yeni bedeni ona sadece zenginlik sunsa da Dan Woosung, önceki hayatındaki muazzam serveti ve dövüş sanatları becerileriyle yeniden ayağa kalkar.<br><br>**Editor's note:** Dövüş sanatları serilerinde sıradan kılıç ustalarından sıkılanlar müjde! Sadece bilek gücüyle rakiplerini diz çöktüren Yumruk Kralı geri dönüyor. Akıcı aksiyon sahneleri, temposu hiç düşmeyen kurgusu ve karizmatik başkarakteriyle bu seri, dövüş sanatları ve reenkarnasyon türünün en sağlam örneklerinden biri. Keyifli okumalar!<br><br>**Alternative Names:**<br>- Reincarnation of the Fist King<br>- The Fist King's Rebirth<br>- Yumruk Kralının Fethi<br>- Geri Dönen Yumruk Kralı |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 14 name, chapter 19 name, chapter 20 name |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | PASS | 77 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://seitoon.com.tr/.../image <redacted query values: variant>` (image/webp (encoding: lossy), 79376 bytes, 1200x800) |  |  |  |
