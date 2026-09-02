# Extension Validation Report

- Extension: tachiyomi-tr.yaoiflix-v1.6.60
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9083257818102461515
- Source name: Yaoi Flix
- Source language: tr
- Selected manga input: popular offset 0: Jinx (`.../118`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../118`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Ennead (`.../325`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Desire Me If You Can (`.../2148`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Cherry Blossoms After Winter (`.../472`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Juyeon’s Jinx (`.../424`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../118`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 113 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=Jinx, URL=`118` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoiflix.fit/.../jinxyeni-350x476.webp` (image/webp (encoding: lossy), 33702 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `118` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yaoiflix.fit/.../jinxyeni-193x278.webp` (image/webp (encoding: lossy), 13436 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | BL, Drama, Manhwa, Müstehcen, Orijinal Dilinden Çevrilenler, Webtoon, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Koreceden Çevrilmiştir \| Serimizde günceldeyiz: 2. 12. ve 22. Günler Yeni Bölümler Sitemizde!<br><br>Karma dövüş sanatları hafif ağır sıklet şampiyonu ‘Joo Jaekyung’. Yenilmezlik efsanesi yazsa da, aslında onun da gizli bir uğursuzluğu var.Yani, maçtan önceki gün tatmin edici seks yapmak kazanmasının anahtarıdır! Jaekyung uğursuzluğu fizyoterapist ‘ Kim Dan’ aracılığıyla çözmeye çalışmaya kalkarsa… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | LINT | 18 of 113 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=18 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yaoicdn.xyz/.../1.jpg` (image/jpeg, 136007 bytes, 1131x1600) |  |  |  |
