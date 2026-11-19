# Extension Validation Report

- Extension: tachiyomi-id.komikstation-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6148605743576635261
- Source name: Komik Station
- Source language: id
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Wang Gu Shen Wang (`.../wang-gu-shen-wang`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Yuusha ni Zenbu Ubawareta Ore wa Yuusha no Hahaoya to Party wo Kumimashita! (`.../yuusha-ni-zenbu-ubawareta-ore-wa-yuusha-no-hahaoya-to-party-wo-kumimashita`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | R15+ ja Dame desu ka? (`.../r15-ja-dame-desu-ka`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales of Demons and Gods Bahasa Indonesia (`.../tales-of-demons-and-gods`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 992 | Chapter 1 (`.../tales-of-demons-and-gods-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://komikstation.org/.../Tales-of-Demons-and-Gods-1-212x300.jpg` (image/jpeg, 22506 bytes, 212x300) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Tales of Demons and Gods to Tales of Demons and Gods Bahasa Indonesia |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://komikstation.org/.../Tales-of-Demons-and-Gods-1.jpg` (image/jpeg, 549847 bytes, 1356x1915) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Harem, Martial arts, Romance, Shounen, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nie Lie, Demon Spiritist yang terkuat dikehidupan masa lalunya yang berdiri di puncak dunia persilatan, namun dia kehilangan nyawanya saat pertarungan dengan Sage Emperor dan keenam dewa berperingkat binatang, jiwanya kemudian terlahir kembali saat dia masih berumur 13 tahun. Meskipun dia yang paling lemah di kelasnya dengan bakat terendah hanya diranah Red soul, tapi dengan bantuan pengetahuan yang luas yang dia akumulasi dari kehidupan sebelumnya, dia terlatih begitu cepat dari pada siapapun. Mencoba untuk melindungi kota di masa mendatang sedang diserang oleh binatang dan akhirnya hancur, serta melindungi kekasihnya, teman-temannya dan keluarganya yang meninggal karena serangan binatang. Dan untuk menghancurkan keluarga Sacred yang meninggalkan tugas mereka dan kota yang dikhianati dalam kehidupan masa lalunya.<br><br>Alternative Names: <br>- Cuentos de Demonios y Dioses<br>- Fortellinger om Demoner og Guder<br>- Pasakojimas apie Demonus ir Dievus<br>- Yao Shen Ji<br>- Yaoshenji<br>- Yêu Thần Ký<br>- Yāo Shén Jì<br>- Клеймо Зловещего Духа<br>- Сказания о Демонах и Богах<br>- 妖神记<br>- 妖神记（全彩）<br>- 요신기 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 992 chapters |  |  |  |
| chapter dates | PASS | 992 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.klikcdn.com/.../1_136a96ef78c3b99485ade921d8313bcd.jpg` (image/jpeg, 328172 bytes, 847x1200) |  |  |  |
