# Extension Validation Report

- Extension: tachiyomi-id.maidmanga-v1.6.14
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
- Source ID: 5716614438725518956
- Source name: Maid - Manga
- Source language: id
- Selected manga input: popular offset 0: Lust Geass (`.../lust-geass`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Lust Geass (`.../lust-geass`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | Nihon e Youkoso Elf-san. (`.../nihon-e-youkoso-elf-san`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | Furoufushi Shoujo no Naedoko Ryokouki (`.../furoufushi-shoujo-no-naedoko-ryokouki`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Otoko Girai na Bijin Shimai wo Namae mo Tsugezu ni Tasuketara Ittai Dounaru? (`.../otoko-girai-na-bijin-shimai-wo-namae-mo-tsugezu-ni-tasuketara-ittai-dounaru`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lust Geass (`.../lust-geass`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lust Geass (`.../lust-geass`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | Chapter 00 (`.../lust-geass-chapter-00-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lust Geass, URL=`.../lust-geass` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../yutr.jpg <redacted query values: resize>` (image/jpeg, 26380 bytes, 225x310) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lust-geass` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../yutr.jpg` (image/jpeg, 84176 bytes, 400x569) |  |  |  |
| details author | PASS | TAKAHASHI OSAMU (Story & Art). |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Comedy, Ecchi, Harem, Romance, School, Seinen, Smut, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pada hari Ulang Tahun Rikka si Pecinta Supranatural, Souta memberikannya buku Sihir yang kebetulan ia temukan di Toko Buku Tua. Keesokan Harinya, Entah mengapa Rikka tiba-tiba muncul di depan Souta dalam keadaan telanjang!? Sebuah cerita Komedi Romantis tentang Buku Sihir yang dapat membangun hubungan cinta… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | LINT | 43 of 46 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=43 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://2.bp.blogspot.com/.../0a.jpg` (image/jpeg, 353813 bytes, 855x1216) |  |  |  |
