# Extension Validation Report

- Extension: tachiyomi-id.komikmu-v1.6.2
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
- Source theme: mangathemesia
- Source ID: 3003360347791538503
- Source name: Komikmu
- Source language: id
- Selected manga input: popular offset 0: Komikus Fasik (`.../komikus-fasik`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Komikus Fasik (`.../komikus-fasik`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Sinar Jaya Gurih Sekolah Series (`.../sinar-jaya-gurih-sekolah-series`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Rencana Pertukaran Ibu-Ibu Elegan (MILF Exchange Plan) (`.../rencana-pertukaran-ibu-ibu-elegan-milf-exchange-plan`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Pijatan Terapis Tampan Bikin Ketagihan (`.../pijatan-terapis-tampan-bikin-ketagihan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Komik Dewasa Komikus Fasik Surti Series (`.../komik-dewasa-komikus-fasik-surti-series`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Komikus Fasik (`.../komikus-fasik`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 01 - Surti Terpakai (`.../komikus-fasik-surti-terpakai`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Komikus Fasik, URL=`.../komikus-fasik` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../Komikus-Fasik.jpg <redacted query values: resize>` (image/jpeg, 24168 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../komikus-fasik` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../Komikus-Fasik.jpg` (image/jpeg, 111568 bytes, 935x542) |  |  |  |
| details author | PASS | Komikus Fasik |  |  |  |
| details artist | PASS | Komikus Fasik |  |  |  |
| details genres | PASS | Adult, Lokal, Comic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baca komik “Komikus Fasik” – Baca komik gratis dengan kualitas terbaik. Temukan ribuan komik lokal berbahasa Indonesia yang trending dan viral. Komikus Fasik Komikmu adalah website komik lokal berbahasa Indonesia dengan genre komik komedi, horor, sarkas dan komik dewasa yang berisi protes juga sindiran terhadap segala bentuk yang relevan pada kehidupan saat ini. Pembaca bisa membaca secara online melalui website kami dan juga bisa mendownload file pdf untuk di simpan dan dijadikan arsip. Di dalam website kami juga terdapat banyak komik-komik favorit yang telah di pilih secara khusus. Disarankan Kebijaksaan dalam membaca isi konten komik kami. Isi Website kami hanya berunsur hiburan belaka tanpa ada maksud untuk mendorong dalam bentuk kekerasan maupun vandalisme atupun sarkasme verbal. Untuk membaca komik dewasa lainnya silahkan KLIK DISINI Top keyword yang sedang trending dan viral, komik dewasa, komedi, horor, sarkas, komik madloki, sjg, sinar jaya gurih, bebih, hijabizah, box gurih, jambu madu, hijabolic, kharisma jati, komik lokal, okkycreed, si kipli, komik seru, komik hot, komik manga, manhwa, manhua, komik jadul, tintin, komik 3D, komik bahasa indonesia, komik facebook, galeri komik, galeri komik madloki, galeri komik lokal bahasa indonesia, komik lucu, komik petualangan, komik 18 plus, komik adult, komik jilbab, komik hijab, komik horor, komik sadis, komik author indo, komikindo, komik indo, komik kartun, komik terkenal, komik gratis, komik berbayar, beli komik, download komik, unduh komik, komikmu komik lucu, komikita, komiklokal, komikdewasa, komiktap, doujindesu, Nusantara Horror Story, Drama, Komik Drama. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0002.jpg` (image/jpeg, 2678938 bytes, 5600x7000) |  |  |  |
