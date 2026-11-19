# Extension Validation Report

- Extension: tachiyomi-tr.mangatilkisi-v1.6.63
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1820900722595855271
- Source name: MangaTilkisi
- Source language: tr
- Selected manga input: popular offset 0: Murim Dünyasına Giriş (`.../140`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Murim Dünyasına Giriş (`.../140`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Kamp Yaparak İyileşiyorum (`.../204`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Murim Dünyasına Giriş (`.../140`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Savaşçılar Lisesi – Zindan Baskını Departmanı (`.../221`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Murim Dünyasına Giriş (`.../140`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Murim Dünyasına Giriş (`.../140`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Bölüm 251 YENİ SEZON (`.../bolum-251-yeni-sezon`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Murim Dünyasına Giriş, URL=`140` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.tilkiscans.com/.../Murim-Dunyasina-Giris-2-350x476.webp` (image/webp (encoding: lossy), 65482 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `140` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.tilkiscans.com/.../Murim-Dunyasina-Giris-2.webp` (image/webp (encoding: lossy), 506358 bytes, 1042x1510) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Dövüş Sanatları, Drama, Fantastik, Komedi, Macera, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Murim Dünyasına Giriş Avcıların canavarları avlamak için geçitleri kullandığı bir dönemde, kahramanımız düşük seviyeli bir avcı olan Kahraman, bir VR makinesi edinir. Yanlışlıkla dövüş sanatlarının yer aldığı bir oyuna adım atar. Sayısız zorluk ve engelin ardından, Kahraman bu dünyadan kaçmayı başarır ve Murim’den kazandığı güç ve yetenekleri kendi gerçek dünyasında kullanma fırsatı bulur. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.tilkiscans.com/.../000000.webp` (image/webp (encoding: lossy), 550386 bytes, 941x1672) |  |  |  |
