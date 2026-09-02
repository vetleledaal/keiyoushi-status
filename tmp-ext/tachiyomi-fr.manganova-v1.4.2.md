# Extension Validation Report

- Extension: tachiyomi-fr.manganova-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 514127183927359583
- Source name: MangaNova
- Source language: fr
- Selected manga input: popular offset 0: Akane-banashi (`.../akane-banashi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 41 | Akane-banashi (`.../akane-banashi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 3 | My Hero Academia (`.../my-hero-academia`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Akane-banashi (`.../akane-banashi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Akane-banashi (`.../akane-banashi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Volume 01 - #1 - Ce jour-là (`.../1.0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 55 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 41 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Akane-banashi, URL=`.../akane-banashi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manga-nova.com/.../poster-akane-banashi.jpg` (image/jpeg, 222239 bytes, 800x1218; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../akane-banashi` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.manga-nova.com/.../poster-akane-banashi.jpg` |  |  |  |
| details author | PASS | Yuki SUENAGA |  |  |  |
| details artist | PASS | Takamasa MOUE |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pour la jeune Akane, son père Toru est doté d’un incroyable pouvoir : assis seul sur scène, il est capable de donner vie à une multitude de personnages différents, armé uniquement d’un éventail et d’un carré de tissu ! Toru pratique le rakugo, une forme de spectacle humoristique populaire née il y a des centaines d’années, mais toujours vivante.<br><br>Malgré les moqueries de son entourage, il rêve d’accéder au rang de maître. La pression est d’autant plus forte qu’il ne veut pas décevoir sa femme, soutien de toujours, ni surtout sa fille Akane… Elle l’admire au point de l’imiter, répétant les scènes de rakugo en cachette ! Le jour de l’examen de passage vers le grade ultime, la barre est placée haut : ce n’est rien de moins que le célèbre Issho Arakawa, maître incontesté de la discipline, qui joue le rôle de juré. Toru donne une performance remarquable, la salle se tord de rire ! Et pourtant, Issho le déclare indigne du titre…<br><br>Pire, il le bannit à vie du monde du rakugo, sans aucune explication ! La carrière d’artiste de Toru est brisée, sans que personne n’en comprenne la raison… mais Akane reprend le flambeau, bien décidée à réaliser son rêve et à découvrir la vérité derrière ce scandale ! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices must start at 0 and increase by 1. Pages 2 through 55 use index 0. |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manga-nova.com/.../7fe30924b2e789da148b3a2d78f6c6f0.jpg` (image/jpeg, 423919 bytes, 1380x2100; server Content-Type: application/octet-stream) |  |  |  |
