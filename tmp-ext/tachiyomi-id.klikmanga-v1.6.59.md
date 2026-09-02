# Extension Validation Report

- Extension: tachiyomi-id.klikmanga-v1.6.59
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5213948951740602020
- Source name: KlikManga
- Source language: id
- Selected manga input: popular offset 0: Kimetsu no Yaiba (`.../1051`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Kimetsu no Yaiba (`.../1051`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 25 | Minamoto-kun Monogatari (`.../1326`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Debut With You (`.../31361`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 25 | Reincarnation of the Veteran Soldier (`.../22755`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Kimetsu no Yaiba – X Years Later – Tanjiro Proposes (`.../18305`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimetsu no Yaiba (`.../1051`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 237 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 7: title=Kimetsu no Yaiba, URL=`1051` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 108/108 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 108/108 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://klikmanga.org/.../18198-175x238.jpg` (image/jpeg, 17725 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1051` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://klikmanga.org/.../18198-193x278.jpg` (image/jpeg, 22475 bytes, 193x278) |  |  |  |
| details author | PASS | Gotouge Koyoharu |  |  |  |
| details artist | PASS | Gotouge Koyoharu |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Historical, Martial Arts, Shounen, Supernatural, Tragedy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tanjirou Kamado, pemuda sulung dari keluarga yang kurang mampu dan tinggal di pedalaman gunung pada era Taisho. Sejak dahulu kala, terdapat rumor mengenai Oni (Iblis Pemakan Manusia) yang bersembunyi di hutan. Karena itu, penduduk setempat tidak pernah berani keluar di malam hari. Legenda mengatakan bahwa Pembasmi Oni juga berkeliaran di malam hari dan memburu iblis yang haus darah. Bagi Tanjirou yang belum mengetahui apa-apa, hal itu hanyalah sekedar rumor belaka dan tidak akan menyebabkan masalah di kehidupannya.<br><br>Sejak kematian ayahnya, Tanjirou menggantikan ayahnya untuk memenuhi kebutuhan keluarganya. Meski kehidupan mereka sangat berat, mereka merasakan kebahagiaan dan kehangatan yang luar biasa dari keluarganya. Tapi, kebahagiaan itu hancur saat Tanjirou melihat keluarganya dibantai saat dirinya meninggalkan rumah untuk bekerja menjual arang di Kota. Tidak hanya itu, satu-satunya keluarganya yang selamat, adik perempuannya Nezuko, berubah menjadi Oni. Namun yang mengejutkannya, Nezuko masih menunjukkan emosi dan pemikiran manusia dengan mencoba melindungi Tanjirou dari serangan Pembasmi Oni. Dimulailah perjalanan Tanjirou untuk melawan Oni dan mengembalikan adiknya menjadi manusia kembali. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 237 chapters |  |  |  |
| chapter dates | LINT | 220 of 237 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=220 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.bakacdn.com/.../001.jpg` (image/jpeg, 197422 bytes, 800x649) |  |  |  |
