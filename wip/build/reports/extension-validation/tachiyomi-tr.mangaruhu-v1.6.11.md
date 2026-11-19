# Extension Validation Report

- Extension: tachiyomi-tr.mangaruhu-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 23
- Lint: 0
- Warnings: 2
- Skipped: 10
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 8370882282338930409
- Source name: Manga Ruhu
- Source language: tr
- Selected manga input: popular offset 0: Şeytani Çağ (`.../chronicles-of-the-demon-faction`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Şeytani Çağ (`.../chronicles-of-the-demon-faction`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Erkek Başrol Sağlığıma Kafayı Takmış Durumda (`.../erkek-basrol-sagligima-kafayi-takmis-durumda`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 100 Milyon Yıllık Düğmeye Basıp Fark Etmeden En Güçlü Oldum (`.../100-milyon-yillik-dugmeye-basip-fark-etmeden-en-guclu-oldum`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ölümsüzün Yolculuğu (`.../immortals-way-of-life`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Şeytani Çağ (`.../chronicles-of-the-demon-faction`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ruhmanga.com/.../file_00000000ae308246b68a7dbe7fae86ef-200x267.webp` (image/webp (encoding: lossy), 398976 bytes, 1086x1448) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chronicles-of-the-demon-faction` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://ruhmanga.com/.../file_00000000ae308246b68a7dbe7fae86ef.webp` was not downloaded |  |  |  |
| details author | PASS | soldret |  |  |  |
| details artist | PASS | codezero |  |  |  |
| details genres | PASS | Aksiyon, Dövüş Sanatları, Drama, Fantastik, Macera, Manhwa, Reenkarnasyon |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Chun Haijin, Doğrucu Göksel Birliğin en iyi suikastçısıydı. Kendi özgürlüğüne kavuşmaya çalışırken son nefesini verdi. Sonrasında… “Onun öğretileri sorgulanamaz, bütün iblisler emrinize amadedir! Üçüncü genç efendi, iyileşmenizi kutlarız!” Kendisini murimin en büyük düşmanı olan “Göksel İblis Tarikatı”nın üçüncü genç efendisi olarak buldu! Ortodoksların en güçlü silahı olan Haijin artık murimi şeytani bir çağa hazırlıyor. Chronicles of the Demon Faction mangaruhu türkçe oku<br><br>Alternatif Başlık: 마도전생기, Chronicles of the Demon Faction, Crónicas de la Facción Demoníaca, Crônicas da Facção Demoníaca |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://mangaruhu.net/.../manga-ranking` to `https://ruhmanga.com/.../manga-ranking` (1 redirects); popular: `https://mangaruhu.net/.../recently-updated` to `https://ruhmanga.com/.../recently-updated` (1 redirects); popular: `https://mangaruhu.net/.../2` to `https://ruhmanga.com/.../2` (1 redirects); popular: `https://mangaruhu.net/.../chronicles-of-the-demon-faction` to `https://ruhmanga.com/.../chronicles-of-the-demon-faction` (1 redirects); popular: `https://mangaruhu.net/.../search <redacted query values: term and page>` to `https://ruhmanga.com/.../search` (1 redirects); popular: `https://mangaruhu.net/.../chronicles-of-the-demon-faction` to `https://ruhmanga.com/.../chronicles-of-the-demon-faction` (1 redirects); popular: `https://mangaruhu.net/.../2` to `https://ruhmanga.com/.../2` (1 redirects); popular: `https://mangaruhu.net/.../chapters <redacted query values: manga_id, per_page, and paged>` to `https://ruhmanga.com/.../chapters` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
