# Extension Validation Report

- Extension: tachiyomi-tr.eskimangalar-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: uzaymanga
- Source ID: 455290087526139932
- Source name: Eski Mangalar
- Source language: tr
- Selected manga input: popular offset 0: Geçmişten Gelen Oyuncu (`.../gecmisten-gelen-oyuncu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Geçmişten Gelen Oyuncu (`.../gecmisten-gelen-oyuncu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Ben Gerçekten Kötü Biri Değilim (`.../ben-gercekten-kotu-biri-degilim`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | İmparatorluktan İntikam Alacağım! (`.../imparatorluktan-intikam-alacagim`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 9 | Zengin Oyuncu (`.../zengin-oyuncu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Geçmişten Gelen Oyuncu (`.../gecmisten-gelen-oyuncu`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Geçmişten Gelen Oyuncu (`.../gecmisten-gelen-oyuncu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 255 | Bölüm 1 (`.../1-bolum-oku`) |  | <1s |
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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Geçmişten Gelen Oyuncu, URL=`.../gecmisten-gelen-oyuncu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-es.efsaneler2.can.re/.../thumbnail.avif` (image/webp (encoding: lossy), 13978 bytes, 181x272; server Content-Type: image/avif) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gecmisten-gelen-oyuncu` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-es.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantastik, Macera, Aksiyon, Oyun, Reankarnasyon, Sistem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Önceki hayatında maksimum seviyeye ulaşmış bir hırsız olan Ling Ce, üç yıl öncesine geri döner. Bu, kaderin ona bir sınavı mı yoksa bir ödülü müdür?<br><br>Yeniden doğmuşken, önceki hayatında ulaşamadığı güçleri, koruyamadığı insanları ve sadece hayalini kurabildiği her şeyi bu kez elde etmeye kararlıdır.<br><br>Zirvenin de ötesine geçerek, ezici bir güçle sınırları aşacak ve en güçlü “Uyanan” olmaya yükselecektir. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 255 chapters |  |  |  |
| chapter dates | PASS | 255 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-es.efsaneler2.can.re/.../5.avif` (image/jpeg, 1762998 bytes, 800x30541; server Content-Type: image/avif) |  |  |  |
