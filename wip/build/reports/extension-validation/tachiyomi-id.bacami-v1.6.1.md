# Extension Validation Report

- Extension: tachiyomi-id.bacami-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 2677079941490683989
- Source name: Bacami
- Source language: id
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | One Piece (`.../one-piece`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 15 | Wake Up, Warrior (`.../wake-up-warrior`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Reincarnator (`.../reincarnator`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Munou no Akudou Ouji wa Ikinokoritai ~Ren’ai RPG no Akuyaku Mob ni Tensei Shita kedo, Gensaku Mushi shite Saikyou o Mezasu~ (`.../munou-no-akudou-ouji-wa-ikinokoritai-renai-rpg-no-akuyaku-mob-ni-tensei-shita-kedo-gensaku-mushi-shite-saikyou-o-mezasu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | One Piece (`.../one-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1226 | One Piece Chapter 1 (`.../one-piece-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bmcdn.my.id/.../009272f9nuw8GnkzzmkzaGDjwN6KEOaGjj8GntpAzvw845xGpaGkp8GFt8GBrhnuht8G8ukjaGaGbGzwAAooQ.png` (image/png, 262438 bytes, 533x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | PASS | `https://bmcdn.my.id/.../009272f9nuw8GnkzzmkzaGDjwN6KEOaGjj8GntpAzvw845xGpaGkp8GFt8GBrhnuht8G8ukjaGaGbGzwAAooQ.png` |  |  |  |
| details author | PASS | Oda, Eiichiro (Story & Art) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Shounen, Super Power |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One Piece diciptakan oleh Eiichiro Oda. Komiknya dimulai pada 1997 di Shonen Jump terbitan Shueisha dan hingga kini masih terus berlanjut. One piece itu sendiri bercerita tentang seorang Monkey D. Luffy, alias Luffy, seorang bajak laut yang berobsesi untuk menemukan One Piece, salah satu harta karun paling berharga yang ada di dunianya Luffy waktu itu. Setelah Luffy kecil diselamatkan oleh seorang bajak laut bernama Sanks, Luffy akhirnya bertekat untuk menjadi ‘the real’ bajak laut dengan cara berpetualang ke seluruh penjuru dunia dan menemukan One Piece. Di perjalanannya itulah Luffy menemukan berbagai petualangan seru bersama kapal Going Merry nya. Monkey D. Luffy alias Luffy, adalah kapten dari Kelompok Bajak Laut Topi Jerami. Kepala Luffy 300 juta berry setelah peristiwa di Enies Lobby. Ketika Luffy masih muda, dia secara tidak sengaja memakan Buah Iblis (di versi anime, dia memakannya asal-asalan dengan marah karena merajuk pada Shanks) yaitu Buah Gomu Gomu yang ia anggap adalah makanan penutup. Buah Gomu Gomu (Gomu berarti karet) adalah buah iblis yang menyebabkan tubuh pengguna menjadi melar kayak karet dan bisa memanjangkan anggota tubuhnya Berbeda dengan stereotype kebanyakan dari seorang Tokoh Utama, Luffy muncul malah dengan sifatnya yang sedikit bodoh dan ceroboh. Sebagai seorang bajak laut Luffy bisa dikatakan sangat awam karena tidak mengetahui apapun tentang kompas dan ilmu kelautan. Selain itu dia tidak bisa berenang karena memakan Buah Gomu Gomu. Ciri ciri dari Luffy adalah topi jerami di kepalanya, ia diberikan topi jerami oleh Shanks, bajak laut idolanya semasa ia masih kecil, sehingga kelak ia harus mengembalikannya jika bertemu lagi dilaut.<br><br>Alternative Title: One Piece, One Piece, ONE PIECE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1226 chapters |  |  |  |
| chapter dates | PASS | 1226 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://v1.bacami.site/.../score` to `https://v1.bacami.site/.../score` (2 redirects); popular: `https://v1.bacami.site/.../latest` to `https://v1.bacami.site/.../latest` (2 redirects); popular: `https://v1.bacami.site/.../2` to `https://v1.bacami.site/.../2` (2 redirects); popular: `https://v1.bacami.site/.../One%20Piece` to `https://v1.bacami.site/.../One%20Piece` (2 redirects); popular: `https://v1.bacami.site/.../2` to `https://v1.bacami.site/.../2` (2 redirects) |  |  |  |
| page load | PASS | `https://bmcdn.my.id/.../0-e998858fnwq8G877cGhj9mbjaib977f89fbcdb79jkaG78aGg879azYFGntpaGhnuhtaGkp8GFt8GBrhnuht8GukjaGaGbGzwAAofX.jpg` (image/jpeg, 123236 bytes, 700x1100) |  |  |  |
