# Extension Validation Report

- Extension: tachiyomi-id.ngomik-v1.4.38
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5360960267485387879
- Source name: Ngomik (unoriginal)
- Source language: id
- Selected manga input: latest offset 0: Ririmu Horikku (`.../ririmu-horikku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 22 | The Return of the Disaster-Class Hero (`.../the-return-of-the-disaster-class-hero`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 22 | Ririmu Horikku (`.../ririmu-horikku`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 22 | I Quit Everything to Selling Cola (`.../i-quit-everything-to-selling-cola`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ririmu Horikku (`.../ririmu-horikku`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ririmu Horikku (`.../ririmu-horikku`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 14 | Chapter 01 (`.../ririmu-horikku-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 68 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ririmu Horikku, URL=`.../ririmu-horikku` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.bid-cdn.cloud/.../Ririmu-Horikku.webp` (image/webp (encoding: lossy), 116078 bytes, 600x862) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ririmu-horikku` |  |  |  |
| details thumbnail URL | PASS | `https://cover.bid-cdn.cloud/.../Ririmu-Horikku.webp` |  |  |  |
| details author | PASS | TSUMUGI Musawo |  |  |  |
| details artist | PASS | TSUMUGI Musawo |  |  |  |
| details genres | PASS | Comedy, Ecchi, Romance, School life, Shounen, Supernatural, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Di dunia tempat manusia dan succubus hidup berdampingan, Yui Hayato—seorang otaku jenius dengan krisis percaya diri tingkat dewa—naksir berat pada teman sekelasnya, succubus cantik Katou Emu. Masalahnya? Hayato terlalu sibuk ngebatin, “Mana mungkin cewek sekeren dia suka cowok suram kayak gue?” Padahal faktanya, Emu diam-diam justru bucin berat dan mati-matian cari cara buat mepet Hayato! Siap-siap dibuat gemas dengan komedi romantis penuh salah paham, di mana dua hati yang saling naksir ini terus-terusan gagal connect!<br><br>Alternative Names: Lilim Holic, りりむホリック |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | LINT | 12 of 14 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://srvr1.bid-cdn.cloud/.../001.webp` (image/webp (encoding: lossy), 83552 bytes, 800x560) |  |  |  |
