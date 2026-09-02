# Extension Validation Report

- Extension: tachiyomi-id.wurmz-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 925868633785419090
- Source name: Wurmz
- Source language: id
- Selected manga input: popular offset 0: Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10 Nen ga Tattara Densetsu ni Natteita (`.../setelah-10-tahun-saya-menjadi-legenda`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10 Nen ga Tattara Densetsu ni Natteita (`.../setelah-10-tahun-saya-menjadi-legenda`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Leu Leu Leu (`.../leu-leu-leu`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10 Nen ga Tattara Densetsu ni Natteita (`.../setelah-10-tahun-saya-menjadi-legenda`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10 Nen ga Tattara Densetsu ni Natteita (`.../setelah-10-tahun-saya-menjadi-legenda`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 115 | Chapter 1.1 (`.../1.1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10 Nen ga Tattara Densetsu ni Natteita, URL=`.../setelah-10-tahun-saya-menjadi-legenda` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 62/62 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 62/62 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wurmz.net/.../manga__setelah-10-tahun-saya-menjadi-legenda.webp` (image/webp (encoding: lossy), 17860 bytes, 220x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../setelah-10-tahun-saya-menjadi-legenda` |  |  |  |
| details thumbnail URL | PASS | `https://wurmz.net/.../manga__setelah-10-tahun-saya-menjadi-legenda.webp` |  |  |  |
| details author | PASS | Ezo Gingitsune |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Demons, Fantasy, Magic, Vampire |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kelompok Pahlawan diserang oleh sekelompok besar iblis yang kuat. Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10-nen ga Tattara Densetsu ni Natteita. Party itu pasti akan musnah jika ini terus berlanjut. Salah satu anggota party, penyihir terkuat, Rakku (keberuntungan), memutuskan untuk menghentikan musuh di jalur mereka.<br><br>Nama Alternatif: Koko wa Ore ni Makasete Saki ni Ike to Itte kara 10 Nen ga Tattara Densetsu ni Natteita |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | LINT | All 115 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=115 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../43323xrkk1loz9mdvsrx001.jpg` (image/jpeg, 44809 bytes, 720x491) |  |  |  |
