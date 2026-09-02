# Extension Validation Report

- Extension: tachiyomi-tr.laviniafansub-v1.6.60
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3269982329415083765
- Source name: Lavinia Fansub
- Source language: tr
- Selected manga input: popular offset 0: Placebo: Let’s Play (`.../1068`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Placebo: Let’s Play (`.../1068`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Semantic Error (`.../6612`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Lewd Invasion (`.../18083`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Song of the Wasteland (`.../18982`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Placebo: Let’s Play (`.../1068`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 70 | 1. Bölüm (`.../1-bolum`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Okumak için WebView üzerinden giriş yapın | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Okumak için WebView üzerinden giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://laviniafansub.shop/.../86e2bb2e8b08ff7ae2d3d636ec686f15-350x476.jpg` (image/jpeg, 28005 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1068` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://laviniafansub.shop/.../86e2bb2e8b08ff7ae2d3d636ec686f15-193x278.jpg` (image/jpeg, 11987 bytes, 193x278) |  |  |  |
| details author | PASS | Cuke Soap |  |  |  |
| details artist | PASS | Lavinia fansub |  |  |  |
| details genres | PASS | Ayıplı, Boys, Dram, Manhwa, Psikolojik, Reşit, Tamamlandı, Toksik |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | “Hadi oynayalım…”<br><br>Seo Wooyeon’un tek istediği son derece sinir bozucu üvey kardeşi Woojin’den uzakta basit bir üniversite hayatıdır. Woojin’in sadece aynı üniversitede girmekle kalmayıp, onunla aynı dalı ve hatta aynı sınıfı tercih etmesiyle yaşadığı hayal kırıklığını bir düşünün! Wooyeon, kardeşinin gerçekte ne kadar berbat biri olduğunu dünyaya göstermeye kararlıdır, ama… hafızası son günlerde gerçekten zayıftır. Üstüne de Woojin her zamankinden daha kibirli davranıyor gibi görünmektedir. Wooyeon’un hatırlayamadığı zamanlarda neler oluyor ve Woojin’in bununla ne ilgisi var?<br><br>“Oyun zamanı bitti.”<br><br>Alternative Names: Placebo: Let's play - PLACEBO: Juguemos; |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 70 chapters |  |  |  |
| chapter dates | PASS | 70 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Okumak için WebView üzerinden giriş yapın |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
