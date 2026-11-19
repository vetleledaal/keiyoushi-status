# Extension Validation Report

- Extension: tachiyomi-tr.outcatsscans-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 1
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 697971114327882226
- Source name: Outcats Scans
- Source language: tr
- Selected manga input: popular offset 0: Kanlı Haziran (`.../173`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Kanlı Haziran (`.../173`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Rix Vanus (`.../231`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kanlı Haziran (`.../173`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kanlı Haziran (`.../173`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 44 | Bölüm 0 - Kimsin Sen? (`.../bolum-0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in to the site in WebView to read this chapter (a free account is enough) | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in to the site in WebView to read this chapter (a free account is enough) | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kanlı Haziran, URL=`173` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://outcatscans.net/.../b0592167-4940-4848-aa3f-1c45e90a279c_z-350x476.jpg` (image/jpeg, 48781 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `173` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://outcatscans.net/.../b0592167-4940-4848-aa3f-1c45e90a279c_z-193x278.jpg` (image/jpeg, 18196 bytes, 193x278) |  |  |  |
| details author | PASS | Ji Nyoong |  |  |  |
| details artist | PASS | Ji Nyoong |  |  |  |
| details genres | PASS | Aksiyon, Dram, Romantik, Smut, Suç, Yaoi, Yetişkin, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ortağı öldürüldüğünde ve katili serbest kaldığında, Yoonseok adaleti kendi elleriyle sağlamaya karar verir. Şimdilerde ise onu tehlikenin ortasına atan bir savcının piyonu haline gelmiştir; bilgi toplamak amacıyla suçlular tarafından cinsel saldırıya uğramakta ve bedeni istismar edilmektedir.<br><br>Ölümü arzulayan, içi boşalmış bir kabuktan farksız bir haldeyken, şiddet dolu sadizmi Yoonseok’ta bir şeyleri tetikleyen çete üyesi Baek Gitae’yi araştırmaya başlar. Yoonseok, acısından kaçmak için mi Gitae’nin cinsel saldırganlığının peşinden gitmektedir? Yoksa bundan zevk mi almaya başlamıştır?<br><br>Alternative Names: June's Nior, June's Noir, Noir of June, Noir of Yuwol, 六月のノワール 六月的黑色, 유월의 느와르 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | LINT | All 44 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=44 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in to the site in WebView to read this chapter (a free account is enough) |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
