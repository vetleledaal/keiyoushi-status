# Extension Validation Report

- Extension: tachiyomi-id.bacami-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2677079941490683989
- Source name: Bacami
- Source language: id
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Wake Up, Warrior (`.../wake-up-warrior`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Home Plate Villain (`.../home-plate-villain`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | I Randomly Have A New Career Every Week (`.../i-randomly-have-a-new-career-every-week`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | One Piece (`.../one-piece`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece Bahasa Indonesia (`.../one-piece`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1222 | One Piece Chapter 1 (`.../one-piece-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | <1s |

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
| thumbnail | PASS | `https://bmcdn.my.id/.../009272f9nuw8GnkzzmkzaGDjwN6KEOaGjj8GntpAzvw845xGpaGkp8GFt8GBrhnuht8G8ukjaGaGbGzwAAooQ.png` (image/png, 262438 bytes, 533x800; server Content-Type: image/webp) |  |  |  |
| details identity | UNUSUAL | Details changed selected title One Piece to One Piece Bahasa Indonesia |  |  |  |
| details thumbnail URL | PASS | `https://bmcdn.my.id/.../009272f9nuw8GnkzzmkzaGDjwN6KEOaGjj8GntpAzvw845xGpaGkp8GFt8GBrhnuht8G8ukjaGaGbGzwAAooQ.png` |  |  |  |
| details author | PASS | Oda, Eiichiro (Story & Art) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Shounen, Super Power |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One Piece diciptakan oleh Eiichiro Oda. Komiknya dimulai pada 1997 di Shonen Jump terbitan Shueisha dan hingga kini masih terus berlanjut. One piece itu sendiri bercerita tentang seorang Monkey D. Luffy, alias Luffy, seorang bajak laut yang berobsesi untuk menemukan One Piece, salah satu harta karun paling berharga yang ada di dunianya Luffy waktu itu. Setelah Luffy kecil diselamatkan oleh seorang bajak laut bernama Sanks, Luffy akhirnya bertekat untuk menjadi ‘the real’ bajak laut dengan cara berpetualang ke seluruh penjuru dunia dan menemukan One Piece. Di perjalanannya itulah Luffy menemukan berbagai petualangan seru bersama kapal Going Merry nya. Monkey D. Luffy alias Luffy, adalah kapten dari Kelompok Bajak Laut Topi Jerami. Kepala Luffy 300 juta berry setelah peristiwa di Enies Lobby. Ketika Luffy masih muda, dia secara tidak sengaja memakan Buah Iblis (di versi anime, dia memakannya asal-asalan dengan marah karena merajuk pada Shanks) yaitu Buah Gomu Gomu yang ia anggap adalah makanan penutup. Buah Gomu Gomu (Gomu berarti karet) adalah buah iblis yang menyebabkan tubuh pengguna menjadi melar kayak karet dan bisa memanjangkan anggota tubuhnya Berbeda dengan stereotype kebanyakan dari seorang Tokoh Utama, Luffy muncul malah dengan sifatnya yang sedikit bodoh dan ceroboh. Sebagai seorang bajak laut Luffy bisa dikatakan sangat awam karena tidak mengetahui apapun tentang kompas dan ilmu kelautan. Selain itu dia tidak bisa berenang karena memakan Buah Gomu Gomu. Ciri ciri dari Luffy adalah topi jerami di kepalanya, ia diberikan topi jerami oleh Shanks, bajak laut idolanya semasa ia masih kecil, sehingga kelak ia harus mengembalikannya jika bertemu lagi dilaut.<br><br>Alternative Title: One Piece, One Piece, ONE PIECE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1222 chapters |  |  |  |
| chapter dates | PASS | 1222 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bmcdn.my.id/.../0-e998858fnwq8G877cGhj9mbjaib977f89fbcdb79jkaG78aGg879azYFGntpaGhnuhtaGkp8GFt8GBrhnuht8GukjaGaGbGzwAAofX.jpg` (image/jpeg, 123236 bytes, 700x1100) |  |  |  |
